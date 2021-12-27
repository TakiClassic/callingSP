package DAO;

import com.poi.Marca;
import interfaces.DAOMarca;
import java.sql.PreparedStatement;


public class DAOMarcaImpl extends Conexion implements DAOMarca {

    @Override
    public void registrar(Marca mar) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("{call UPS_CREAR_MARCAS (?)}");
            st.setString(1, mar.getName());
            st.executeUpdate();
        }catch(Exception e){
            System.out.println("Error: " + " " + e);
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void listar(Marca mar) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("{call USP_READ_MARCAS (?)}");
            st.setInt(1, mar.getId());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void modificar(Marca mar) throws Exception {
       try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("{call UPS_ACTUALIZAR_MARCAS (?,?)}");
            st.setInt(1, mar.getId());
            st.setString(2, mar.getName());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void eliminar(Marca mar) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("{call UPS_ELIMINAR_MARCAS (?)}");
            st.setInt(1, mar.getId());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }
    
}
