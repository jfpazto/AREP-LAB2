package edu.escuelaing.arep.SparkWebApp.LinkedList;

/**
 * Esta clase se encarga de construir e implementar la linkedlist
 * @author  Jonathan Fabian Paez Torres
 * @version 1.0
 */
public class LinkedList {
	
	private Nodo head;
    private int size;
    
    /**
     * Metodo constructor LinkedList.
     */
    public LinkedList() {
		
	}

    /**
     * Metodo encargado de insertar un nodo dentro de la lista.
     * @param val valor del nodo que va a asignar.
     */
    public void insertar(double val)
    {
    	Nodo nodo = new Nodo(val);
    	if(this.head == null){
    		head = nodo;
    	}else {
    		Nodo currentNode = head;
    		while(currentNode.getNextNodo() != null){
    			currentNode = currentNode.getNextNodo();
    		}
    		currentNode.setNextNode(nodo);
    	}
        
    }
    
    /**
     * Metodo encargado de agregar un nuevo a la cabeza de la lista.
     * @param num valor que va a asignar al nodo.
     */
    public void insertarHead(double num)
    {
        Nodo nodo = new Nodo(num);
        nodo.setNextNode(head);
        head = nodo;
    }
   
    
    /**
     * Metodo encargado de buscar si un elemento pertenece a la lista.
     * @param num elemento que quiere buscar.
     * @return boolean
     */
    public boolean buscar(double num)
    {
        if (head == null)
        {
            return false;
        }
        else
        {
            Nodo nodo = head;
            while (nodo.getNextNodo() != head)
            {
                if (nodo.getValor() == num)
                {
                    return true;
                }
                nodo = nodo.getNextNodo();
            }
        }
        return false;
        
    }
    
    /**
     * Metodo encargado de borrar un elemento de la lista dada su posicion.
     * @param pos posicion dentro de la lista que desea eliminar.
     */
    public void borrar(int pos)
    {
        Nodo node = head;
        for(int i = 0; i< pos -1; i++)
        {
            node = node.getNextNodo();
        }
        node.setNextNode(node.getNextNodo().getNextNodo());
    }
    
    /**
     * Metodo encargado de retornar el valor de un elemento dentro de la lista
     * @param pos indice del valor que quiere obtener.
     * @return double
     */
    public double returnValue(int pos)
    {
        Nodo nodo = head;
        double valor=0;
        int con=0;
        while (con != pos)
        {
        	valor=nodo.getValor();
            nodo = nodo.getNextNodo();
            con=con+1;
        }
        return valor;
    }

    /**
     * Metodo encargado de imprimir los valores que contiene la lista.
     */
    public void imprimir()
    {
    	this.size=0;
        if(head != null)
        {
            Nodo nodo = head;
            while(nodo.getNextNodo() != null)
            {
            	
                System.out.println(nodo.getValor());
                nodo = nodo.getNextNodo();
                this.size=this.size+1;
            }
            System.out.println(nodo.getValor());
            
        }
        
    }
    
    /**
     * Metodo encargado de retornar la longitud de la lista.
     * @return int
     */
    public int getSize() {
    	this.size=0;
        if(head != null)
        {
            Nodo nodo = head;
            while(nodo.getNextNodo() != null)
            {
            	
                nodo = nodo.getNextNodo();
                this.size=this.size+1;
            }
            this.size=this.size+1;
        }
        return this.size;
    	
    	
    }


}
