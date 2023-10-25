package clases;

public class Producto {

    private Integer stock;
    private String name;
    
    public Producto(){
    
        this.stock = 0;
        this.name = " ";
    
    }
    
    public void setStock(Integer stock){
        this.stock = stock;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Integer getStock(){
        return stock;
    }
}