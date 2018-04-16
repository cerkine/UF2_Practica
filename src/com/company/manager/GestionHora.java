package com.company.manager;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class GestionHora {
    public static int horaActual() {

        LocalDateTime ldt = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        return ldt.getHour();
    }
}
