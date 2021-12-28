/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.poi.Venta;
import java.sql.PreparedStatement;

public class DAOVentaImpl extends Conexion implements DAOVenta{

    @Override
    public void registrar(Venta ven) throws Exception {
    
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("{call UPS_CrearVenta (?)}");
            st.setString(1, ven.getDate());
            st.executeUpdate();
        }catch(Exception e){
            System.out.println("Error: " + " " + e);
            throw e;
        }finally{
            this.cerrar();
        }
    
    }

    @Override
    public void listar(Venta ven) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("{call USP_READ_ID_VENTAS (?)}");
            st.setInt(1, ven.getId());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    
    }

    @Override
    public void modificar(Venta ven) throws Exception {
    
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("{call UPS_ACTUALIZAR_MARCAS (?,?,?)}");
            st.setString(1, ven.getDate());
            st.setInt(2, ven.getProd());
            st.setInt(3, ven.getId());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    
    }

    @Override
    public void eliminar(Venta ven) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("{call UPS_DELETE_VENTAS (?)}");
            st.setInt(1, ven.getId());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    
    }
    
}
