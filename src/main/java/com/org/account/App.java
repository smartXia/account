package com.org.account;

import org.flywaydb.core.Flyway;

public class App {
    public static void main(String[] args) {
        // Create the Flyway instance and point it to the database
        Flyway flyway = Flyway.configure().dataSource("jdbc:mysql://127.0.0.1:3306/springboot?useUnicode=true&characterEncoding=UTF-8", "root", null).load();

        // Start the migration
        flyway.migrate();
    }
}
