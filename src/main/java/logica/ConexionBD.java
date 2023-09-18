package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3307/gestor_grupo2_polo";
    private static final String USUARIO = "1234";
    private static final String CONTRASENA = "1234";

    public static Connection obtenerConexion() throws SQLException {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Error: No se encontró el controlador JDBC.", e);
        } catch (SQLException e) {
            throw new SQLException("Error al conectarse a la base de datos.", e);
        } finally {
          
            if (conexion != null) {
                conexion.close();
            }
        }
        return conexion;
    }
    

}
