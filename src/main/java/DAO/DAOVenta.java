package DAO;

import com.poi.Venta;

public interface DAOVenta {
    public void registrar(Venta ven) throws Exception;
    public void listar(Venta ven) throws Exception;
    public void modificar(Venta ven) throws Exception;
    public void eliminar(Venta ven) throws Exception;      
}
