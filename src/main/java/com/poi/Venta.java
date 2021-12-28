package com.poi;

public class Venta {
    private String fecha;
    private int id;
    private int producto;

    public Venta(String date,int prod, int code) {
        this.fecha = date;
        this.producto = prod;
        this.id = code;
        
    }
    
    public void setData(String date,int prod) {
        this.fecha = date;
        this.producto = prod;
    }
    
    public void setIdData(int code, String date, int prod){
        this.id = code;
        this.fecha = date;
        this.producto = prod;
    }

    public Venta() {

    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int code){
        this.id = code;
    }

    public String getDate() {
        return fecha;
    }
    
    public void setDate(String date){
        this.fecha = date;
    }
    
    public int getProd(){
        return producto;
    }
    
    public void setProd(int prod){
        this.producto = prod;
    }
    
}
