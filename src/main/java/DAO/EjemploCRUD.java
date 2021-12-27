/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import interfaces.Producto;
import interfaces.DAOProducto;

/**
 *
 * @author darkl
 */
public class EjemploCRUD {
    public static void main(){
        Producto pro = new Producto();
        pro.setName("Luciano");
        
        try{
            DAOProducto dao = new DAOProductoImpl();
           // dao.registrar(pro);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
