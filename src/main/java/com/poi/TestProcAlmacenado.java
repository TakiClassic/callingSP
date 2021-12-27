package com.poi;

import interfaces.Producto;
import DAO.DAOProductoImpl;
import interfaces.DAOProducto;
import DAO.Conexion;


public class TestProcAlmacenado {
    Conexion conn;
    public static void main(String[] args){
        Producto pro = new Producto();
        
        //pro.setIdData(10,"Harina", "Disponible", 15);
        pro.setId(9);
        try{
            DAOProducto dao = new DAOProductoImpl();
            //dao.listar(pro);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}