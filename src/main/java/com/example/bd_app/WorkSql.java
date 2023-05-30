package com.example.bd_app;

import com.almasb.fxgl.net.Connection;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WorkSql {
    public static void main(String[] args) {
        String SQL_SELECT = "SELECT * FROM participants;";

        try (Connection conn = DriverManager.getConnection(
                "jdbs:mysql://127.0.01:3306/diceteam", "nik", "1234");
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT));
             {
        }
    }
}
