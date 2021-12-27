package com.poi;

public class Marca {

    private String name;
    private int id;

    public Marca(String nombre) {
        this.name = nombre;
    }
    
    public void setData(String nombre) {
        this.name = nombre;
    }
    
    public void setIdData(int codigo, String nombre){
        this.id = codigo;
        this.name = nombre;
        }

    public Marca() {

    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int codigo){
        this.id = codigo;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String nombre){
        this.name = nombre;
    }
}
