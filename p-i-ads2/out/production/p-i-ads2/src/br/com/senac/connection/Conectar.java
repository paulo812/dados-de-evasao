package br.com.senac.connection;


import java.sql.*;

public class Conectar {
    private static Connection connection;
    private static final String url = "jdbc:mysql://localhost/bd-projeto-integrador?useTimezone=true&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "070294";

    private Conectar() {
    }

    private static Conectar conexao = null;

    public static Conectar getConexao() {
        if(conexao == null){
            conexao = new Conectar();
        }
        return conexao;
    }

    public static Connection getConnection() {
        if (connection == null)
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Conexão OK!");
            } catch (Exception exception) {
                System.out.println("Error: " + exception.getMessage());
            }
        return connection;
    }
}
