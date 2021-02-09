package edu.escuelaing.arep.SparkWebApp.LinkedList;
/**
 * Esta clase se encarga de crear un nodo con sus respectivos metodos y atributos
 * @author  Jonathan Fabian Paez Torres
 * @version 1.0
 */
public class Nodo {

	private double valor;
	private Nodo nextNodo;
	
    /**
     * Metodo que establece el valor para un nodo
     * @param val es el valor para asignar al nodo
     */
	public Nodo(double val) {
		this.valor = val;
	}
	
	
    /**
     * Metodo encargado de retornar el valor actual de un nodo.
     * @return double
     */
	public double getValor() {
		return valor;
	}

	
    /**
     * Metodo encargado de devolver el objeto apuntando al nodo siguiente.
     * @return Nodo
     */

	public Nodo getNextNodo() {
		return nextNodo;
	}

    /**
     * Metodo encargado de agregar un nuevo nodo a la derecha del ultimo es decir a la cola.
     * @param nextNode nuevo nodo a asignar.
     */
	public void setNextNode(Nodo nextNode) {
		this.nextNodo = nextNode;
	}

}
