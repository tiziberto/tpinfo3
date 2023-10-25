package util;

import clases.Producto;

public class NodoAVL<Producto> {
    
    private Producto producto;
    private int height;
    private NodoAVL<Producto> izq;
    private NodoAVL<Producto> der;

    public NodoAVL(Producto prod){

        this.producto = prod;
        this.height = 1;
        this.izq = null;
        this.der = null;

    }

    public NodoAVL(){
        this.producto = null;
        this.height = 0;
        this.izq = null;
        this.der = null;
    }

    public void setProducto(Producto producto){
        this.producto = producto;
    }

    public Producto getProducto(){
        return producto;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return height;
    } 

    public void setIzq(NodoAVL<Producto> izq){
        this.izq = izq;
    }

    public void setDer(NodoAVL<Producto> der){
        this.der = der;
    }

    public NodoAVL<Producto> getIzq(){
        return this.izq;
    }

    public NodoAVL<Producto> getDer(){
        return this.der;
    }

}