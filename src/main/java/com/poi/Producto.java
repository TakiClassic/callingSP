package com.poi;

public class Producto {

    private String name;
    private String state;
    private int price;
    private int marca;
    private int id;

    public Producto(String nombre, String estado, int precio, int marc) {
        this.name = nombre;
        this.state = estado;
        this.price = precio;
        this.marca = marc;
    }
    
    public void setData(String nombre, String estado, int precio, int marc) {
        this.name = nombre;
        this.state = estado;
        this.price = precio;
        this.marca = marc;
    }
    
    public void setIdData(int codigo, String nombre, String estado, int precio, int marc){
        this.id = codigo;
        this.name = nombre;
        this.state = estado;
        this.price = precio;
        this.marca = marc;
    }

    public Producto() {

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
    
    public String getState() {
        return state;
    }

    public void setState(String estado) {
        this.state = estado;
    }
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int precio) {
        this.price = precio;
    }
    
    public int getMarca() {
        return marca;
    }

    public void setMarca(int marc) {
        this.marca = marc;
    }
    
}
