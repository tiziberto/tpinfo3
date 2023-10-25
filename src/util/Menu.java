package util;
import java.util.*;

public class Menu {
    public void menu(){
        int op;
        try (Scanner teclado = new Scanner(System.in)) {
            do{
                System.out.println("-----PRODUCTOS------");
                System.out.println("Ingrese una opcion");
                System.out.println("1. Agregar Producto");
                System.out.println("2. Eliminar Producto");
                System.out.println("3. Buscar Producto");
                System.out.println("4. Pruebas");
                System.out.println("0. Salir del programa");

                op = teclado.nextInt();
                switch(op){
                    case 0:
                        System.out.println("Saliendo del programa.");
                        break;
                    case 1: 
                        /*System.out.println("Ingrese el nombre del producto"); 
                        String buscar = teclado.nextLine();
                        Producto producto = new Producto();
                        producto.setName(nombre);
                        producto.setStock(0);
                        break;*/
                    case 2:  
                        System.out.println("Ingrese el nombre del producto a eliminar"); 
                        String eliminar = teclado.nextLine();
                        break;
                    case 3:
                        System.out.println("Ingrese el nombre del producto a buscar");
                        
                        break;    
                    case 4:
                        Pruebas prueba = new Pruebas();
                        prueba.carga();
                        break;
                    }
            }while(op!=0);
        }
        
        
    }
}