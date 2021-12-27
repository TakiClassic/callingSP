package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Conexion {
    static ResultSet resultado;
    static Statement sentencia;
            
    protected Connection conexion;
    
    private static final String driver ="com.mysql.jdbc.Driver";    
    private final String DB_URL = "jdbc:mysql://localhost:3306/teststore";
    
    private final String USER = "root";
    private final String PASS = "Luciano=Taki183";
    
    public Connection Conectar(){
        conexion = null;
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            if (conexion != null){
                System.out.println("Conexion establecida...");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar"+e);
        }
        return conexion;
    }
    
    public Connection getConnection(){
        return conexion;
    }
    
    public void cerrar() throws SQLException{
        if(conexion != null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
    }
    public void desconectar(){
        conexion = null;
        if (conexion == null){
            System.out.println("Conexion terminada...");
        }
    }
    public static ArrayList<String> llenar_combo(){
      ArrayList<String> lista = new ArrayList<String>();
      String sql = "call USP_READ_ALL_MARCAS;";
      try{
          resultado = sentencia.executeQuery(sql);
          System.out.println("Correcto");
      }catch(Exception e){
          System.out.println(e);
      }
      try{
          while(resultado.next()){
              lista.add(resultado.getString("nombre"));
              System.out.println(lista);
          }
      }catch(Exception e){
          
      }
      return lista;
    }
}
