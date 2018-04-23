package com.company.manager;

import com.company.model.Atraccion;
import com.company.model.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GestionBaseDeDatos {
    static final String url = "jdbc:sqlite:database.db";
    static final int DATABASE_VERSION = 1;

    static GestionBaseDeDatos instance;
    static Connection conn;

    public static GestionBaseDeDatos get(){
        if(instance == null){
            instance = new GestionBaseDeDatos();

            try {
                conn = DriverManager.getConnection(url);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            if(instance.getVersion() != DATABASE_VERSION){
                System.out.println("VERSION = " + instance.getVersion());
                instance.upgradeDatabase();
                instance.setVersion();
            }
        }
        return instance;
    }

    public int getVersion(){
        try (Statement stmt  = conn.createStatement()){
            ResultSet rs  = stmt.executeQuery("PRAGMA user_version");
            while (rs.next()) {
                return rs.getInt("user_version");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }

    public void setVersion(){
        try (Statement stmt  = conn.createStatement()){
            stmt.execute("PRAGMA user_version = " + DATABASE_VERSION);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    void upgradeDatabase(){
        deleteTables();
        createTables();
    }

    void deleteTables(){
        try (Statement stmt = conn.createStatement()) {
            stmt.execute("DROP TABLE IF EXISTS cliente;");
            stmt.execute("DROP TABLE IF EXISTS atracciones;");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    void createTables(){
        try (Statement stmt = conn.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS clientes (nombre text, nota real);");
            stmt.execute("CREATE TABLE IF NOT EXISTS atracciones (nombre text, int edad);");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertCliente(String nombre, double nota) {
        String sql = "INSERT INTO clientes(nombre,nota) VALUES(?,?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setDouble(2, nota);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Cliente[] selectTodasLosClientes(){
        String sql = "SELECT * FROM clientes";

        try (Statement stmt  = conn.createStatement()){
            ResultSet rs  = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString("nombre") + "\t" +
                        rs.getDouble("nota"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return new Cliente[1];
    }

    public Cliente[] selectAtraccionPorEdad(double edad){
        String sql = "SELECT * FROM atracciones WHERE edad = ?";

        try (PreparedStatement pstmt  = conn.prepareStatement(sql)){

            pstmt.setDouble(1, edad);
            ResultSet rs  = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("nombre") + "\t" +
                        rs.getDouble("nota"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return new Cliente[1];
    }
}
