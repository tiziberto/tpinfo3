package util;

import java.util.*;

import clases.Producto;

public class ArbolAVL/*<Producto>*/ {
    //public StackList<String> lista = new StackList();
    private NodoAVL<Producto> root;

    public ArbolAVL(){
        root = new NodoAVL<>();
    }

    public NodoAVL<Producto> getRoot(){
        return root;
    }

    public ArbolAVL/*<Producto>*/ insert(Producto x){
        System.out.println(x.getName());
        root = insert(x, root);
        return this;
    }

    /*public boolean ExistentProduct(String nombre) {
        for(int i=0; i<lista.size() ; i++){
            if(lista.get().equals(nombre)){
                return true;
            }
            return false; //Si no compra con el for
        }
    
    StackList<String> temp = lista.getRoot();

    
    } */

private NodoAVL<Producto> insert(Producto prod, NodoAVL<Producto> node) {
    String aux;
    Producto prodAux = prod;
    if(prodAux == null) System.out.println("EL AUXILIAR ES NULO");
    prodAux = node.getProducto();
    aux = prodAux.getName();
    System.out.println("valor auxiliar "+ aux);
    if (node == null) {
        return new NodoAVL<>(prod);
    } else {
        if (prod.getName().compareTo(aux) < 0) {
            node.setIzq(insert(prod, node.getIzq()));
        } else if (prod.getName().compareTo(aux) > 0) {
            node.setDer(insert(prod, node.getDer()));
        } else {
            System.out.println("Se cargo el elemento"+prod.getName());
            return node;
        }
        updateHeight(node);
        return applyRotation(node);
    }
}




    private void updateHeight(NodoAVL<Producto> node){
        int maxHeight = Math.max(
            height(node.getIzq()),
            height(node.getDer()));
        node.setHeight(maxHeight + 1);
    }

    private int height(NodoAVL<Producto> node) {
        return node != null ? node.getHeight() : 0;
    }

    private NodoAVL<Producto> rotateRight(NodoAVL<Producto> node) {
        NodoAVL<Producto> leftNode = node.getIzq();
        NodoAVL<Producto> centerNode = leftNode.getDer();
        leftNode.setDer(node);
        node.setIzq(centerNode);
        updateHeight(node);
        updateHeight(leftNode);
        return leftNode;
    }

    private NodoAVL<Producto> rotateLeft(NodoAVL<Producto> node) {
        NodoAVL<Producto> rightNode = node.getDer();
        NodoAVL<Producto> centerNode = rightNode.getIzq();
        rightNode.setIzq(node);
        node.setDer(centerNode);
        updateHeight(node);
        updateHeight(rightNode);
        return rightNode;
    }

    private NodoAVL<Producto> applyRotation(NodoAVL<Producto> node){
        int balance = balance(node);
        if (balance > 1) {
            if (balance(node.getIzq()) < 0) {
                node.setIzq(rotateLeft(node.getIzq()));
            }
            return rotateRight(node);
        }
        if (balance < -1) {
            if (balance(node.getDer()) > 0) {
                node.setDer(rotateRight(node.getDer()));
            }
            return rotateLeft(node);
        }
        return node;
    }

    private int balance(NodoAVL<Producto> node) {
        return node != null ? height(node.getIzq()) - height(node.getDer()) : 0;
    }

    public Producto find(String element) {
        return find(root, element);
    }

    private Producto find(NodoAVL<Producto> node, String element) {
        
        if (element.equals(node.getProducto())) {
            return node.getProducto();
        } else if (element.compareTo(((clases.Producto) node.getProducto()).getName()) < 0) {
            if (node.getIzq() != null) return find(node.getIzq(), element);
            else return null;
        } else {
            if (node.getDer() != null) return find(node.getDer(), element);
            else return null;
        }
    }

    public void delete(String producto) {
        root = delete(producto, root);
    }

    private NodoAVL<Producto> delete(String prod, NodoAVL<Producto> node) {
        if (node == null) {
            return null;
        }
        if (prod.compareTo(((clases.Producto) node.getProducto()).getName()) < 0) {
            node.setIzq(delete(prod, node.getIzq()));
        } else if (prod.compareTo(((clases.Producto) node.getProducto()).getName()) > 0) {
            node.setDer(delete(prod, node.getDer()));
        } else {
            // One Child or Leaf Node (no children)
            if (node.getIzq() == null) {
                return node.getDer();
            } else if (node.getDer() == null) {
                return node.getIzq();
            }
            // Two Children
            node.setProducto(getMax(node.getIzq()));
            node.setIzq(delete(((clases.Producto) node.getProducto()).getName(), node.getIzq()));
        }
        updateHeight(node);
        return applyRotation(node);
    }

    public Producto getMax() {
        if (isEmpty()) {
            return null;
        }
        return getMax(root);
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return root.getProducto() == null;
    }


    private Producto getMax(NodoAVL<Producto> node) {
        if (node.getDer() != null) {
            return getMax(node.getDer());
        }
        return node.getProducto();
    }

    public void printInOrder() {
        PrintInOrder(root);
    }

    private void PrintInOrder(NodoAVL<Producto> node) {
        if (node != null) {
            PrintInOrder(node.getIzq());
            System.out.print(((clases.Producto) node.getProducto()).getName() + "\t");
            System.out.print(((clases.Producto) node.getProducto()).getStock() + "\t");
            PrintInOrder(node.getDer());
        }
    }
}
        