/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import DAO.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author darkl
 */
public class Marcas {
    
    private int id;
    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toString(){
        return this.nombre;
    }
    
    public Vector<Marcas> mostrarMarcas(){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.Conectar();
        
        Vector<Marcas> datos = new Vector<Marcas>();
        Marcas dat = null;
        
        String sql = "call USP_READ_ALL_MARCAS";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            dat = new Marcas();
            
            dat.setId(0);
            dat.setNombre("Selecciona una marca");
            datos.add(dat);
            
            while(rs.next()){
                dat = new Marcas();
                dat.setId(rs.getInt("id"));
                dat.setNombre(rs.getString("nombre"));
                datos.add(dat);
            }
            rs.close();
            
        }catch(SQLException e){
            System.out.println("Error: " + e);
        }
        return datos;
    }
    
}
