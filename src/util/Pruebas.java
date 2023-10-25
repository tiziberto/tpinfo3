package util;

import clases.Producto;
import util.ArbolAVL;

public class Pruebas {
    public void carga(){
        ArbolAVL arboloide = new ArbolAVL();
        for(int i = 0;i<5;i++){
            Producto producto = new Producto();
            Float precio = (float) (i * 5.5);
            producto.setStock(1 + i*10);
            producto.setName("Producto " + i);
            System.out.println("Corte 0");
            arboloide.insert(producto);
            System.out.println("Paso" + i);
        }
        System.out.println("Corte 1");
        arboloide.printInOrder();
        System.out.println("Corte 2");
        arboloide.delete("Producto 0");

        arboloide.printInOrder();

        arboloide.find("Producto 3");
    }
}