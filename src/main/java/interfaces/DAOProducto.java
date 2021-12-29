package interfaces;

import com.poi.Producto;

public interface DAOProducto {
    public void registrar(Producto pro) throws Exception;
    public void listar(Producto pro) throws Exception;
    public void modificar(Producto pro) throws Exception;
    public void eliminar(Producto pro) throws Exception;

    //public void registrar(interfaces.Producto pro);
            
}
