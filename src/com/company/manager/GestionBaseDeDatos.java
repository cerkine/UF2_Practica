package com.company.manager;

import com.company.model.Cliente;

import java.sql.*;
public class GestionBaseDeDatos {
    static final String url = "jdbc:sqlite:database.db";
    static final int DATABASE_VERSION = 4;

    static GestionBaseDeDatos instance;
    static Connection conn;

    public static GestionBaseDeDatos get() {
        if (instance == null) {
            instance = new GestionBaseDeDatos();

            try {
                conn = DriverManager.getConnection(url);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            if (instance.getVersion() != DATABASE_VERSION) {
                System.out.println("VERSION = " + instance.getVersion());
                instance.upgradeDatabase();
                instance.setVersion();
            }
        }
        return instance;
    }

    public int getVersion() {
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("PRAGMA user_version");
            while (rs.next()) {
                return rs.getInt("user_version");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }

    public void setVersion() {
        try (Statement stmt = conn.createStatement()) {
            stmt.execute("PRAGMA user_version = " + DATABASE_VERSION);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    void upgradeDatabase() {
        deleteTables();
        createTables();
        insertAdmin();
    }

    void insertAdmin() {
        String sql = "INSERT INTO clientes(DNI, Pass) VALUES(?,?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "admin");
            pstmt.setString(2, "putoamo");
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    void deleteTables() {
        try (Statement stmt = conn.createStatement()) {
            stmt.execute("DROP TABLE IF EXISTS clientes;");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    void createTables() {
        try (Statement stmt = conn.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS clientes (nombre text, apellidos text, DNI text PRIMARY KEY, Pass text, email text, edad integer, height double, money integer);");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insertCliente(String nombre, String apellidos, String DNI, String Pass, String email, int edad, double height, int money) {
        String sql = "INSERT INTO clientes(nombre, apellidos, DNI, Pass, email, edad, height, money) VALUES(?,?,?,?,?,?,?,?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellidos);
            pstmt.setString(3, DNI);
            pstmt.setString(4, Pass);
            pstmt.setString(5, email);
            pstmt.setInt(6, edad);
            pstmt.setDouble(7, height);
            pstmt.setInt(8, money);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Cliente selectCliente(String dni, String pass) {
        String sql = "SELECT * FROM clientes WHERE DNI LIKE ? AND Pass LIKE ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, dni);
            pstmt.setString(2, pass);
            ResultSet rs = pstmt.executeQuery();

            Cliente cliente = new Cliente();
            while (rs.next()) {
                cliente.name = rs.getString("nombre");
                cliente.subname = rs.getString("apellidos");
                cliente.DNI = rs.getString("DNI");
                cliente.pass = rs.getString("Pass");
                cliente.mail = rs.getString("email");
                cliente.ages = rs.getInt("edad");
                cliente.height = rs.getDouble("height");
                cliente.dinero = rs.getInt("money");
                return cliente;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
