/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author darkl
 */
import com.poi.Venta;

public interface DAOVenta {
    public void registrar(Venta ven) throws Exception;
    public void listar(Venta ven) throws Exception;
    public void modificar(Venta ven) throws Exception;
    public void eliminar(Venta ven) throws Exception;      
}
