package interfaces;

import com.poi.Marca;

public interface DAOMarca {
    public void registrar(Marca mar) throws Exception;
    public void listar(Marca mar) throws Exception;
    public void modificar(Marca mar) throws Exception;
    public void eliminar(Marca mar) throws Exception;      
}
