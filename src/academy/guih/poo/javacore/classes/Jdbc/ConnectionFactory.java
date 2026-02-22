package academy.guih.poo.javacore.classes.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    //dados de conexão
    private static final String URL = "jdbc:mysql://localhost:3308/cadastro";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
