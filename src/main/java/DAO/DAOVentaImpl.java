package DAO;

import com.poi.Venta;
import java.sql.PreparedStatement;

public class DAOVentaImpl extends Conexion implements DAOVenta{

    @Override
    public void registrar(Venta ven) throws Exception {
    
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("{call USP_CrearVenta (?)}");
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
            PreparedStatement st = this.conexion.prepareStatement("{call USP_ACTUALIZAR_MARCAS (?,?,?)}");
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
            PreparedStatement st = this.conexion.prepareStatement("{call USP_DELETE_VENTAS (?)}");
            st.setInt(1, ven.getId());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    
    }
    
}
