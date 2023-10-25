/*package util; 

public class StackList<AnyType>
{
    private Nodo<AnyType> root = null;    
    
    public AnyType getRoot(){
        return nodo;
    }

    public void push (AnyType element)
    {
        Nodo<AnyType> nodo = new Nodo<AnyType>(element);
        nodo.next=root;
        root=nodo;
    }
    
    
     public AnyType pop()
    {
        AnyType valor = root.data;
        root=root.next;
        return valor;
    }
     
    public AnyType top(){
            return root.data;}
    
    public boolean isEmpty()
    {
        return this.root==null;
    }
    
    public void makeEmpty()
    {
        this.root=null;
    }
    
    public int size()
    {
        int count=0;
        Nodo<AnyType> recorrer = this.root;
        while(this.root!=null)
        {
            count++;
            recorrer=recorrer.next;
        }
        return count;
    }
    
}           count++;
            recorrer=recorrer.next;
        }
        return count;
    }
    
}*/