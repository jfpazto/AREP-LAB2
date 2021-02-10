package edu.escuelaing.arep.SparkWebApp;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.escuelaing.arep.SparkWebApp.Calcu.Calculadora;
import edu.escuelaing.arep.SparkWebApp.LinkedList.LinkedList;


/**
 * Unit test for simple App.
 */
public class AppTest 
   
{
	/**
	 * Esta prueba verifica que se calcule correctamente el promedio y la desviacion estandar a partir de los primeros datos
	 */
	@Test
	public void Test1() {
        
        LinkedList list=new LinkedList();
        Calculadora calcu=new Calculadora();
        
        list.insertar(1);
        list.insertar(12);
        list.insertar(3);
        list.insertar(45);
        
        double mean=calcu.mean(list);
        double desv=calcu.standarDeviation(list);
		assertEquals(mean,15,25) ;
		assertEquals(desv, 20,4);
	}
	

	

	
	/**
	 * Esta prueba verifica que se haga el promedio de una lista correctamente
	 */
	@Test
	public void TestMean() {
        Calculadora calcu=new Calculadora();
        LinkedList list=new LinkedList();
        list.insertar(2);
        list.insertar(3);
        list.insertar(1);
        list.insertar(3);
        list.insertar(1);
        double valor=calcu.mean(list);
		assertEquals(valor, 2,0);
	}
	
	/**
	 * Esta prueba verifica que se haga la desviacion estandar de una lista correctamente
	 */
	@Test
	public void TestDesv() {
        Calculadora calcu=new Calculadora();
        LinkedList list=new LinkedList();
        list.insertar(18);
        list.insertar(20);
        list.insertar(20);
        list.insertar(22);
        list.insertar(20);
        list.insertar(20);
        double valor=calcu.standarDeviation(list);
		assertEquals(valor, 1,63);
	}
	
	/**
	 * Esta prueba verifica que un nodo se agregue correctamente en la cabeza es decir en la primera posicion
	 */
	@Test
	public void TestInsertHead() {
        LinkedList customLinkedList = new LinkedList();
        customLinkedList.insertarHead(3);
        double valor=customLinkedList.returnValue(1);
		assertEquals(valor, 3,0);
	}
	
	/**
	 * Esta prueba verifica que los valores se inserten correctamente en la lista
	 */
	@Test
	public void TestInsert() {
        LinkedList customLinkedList = new LinkedList();
        customLinkedList.insertar(50);
        customLinkedList.insertar(100);
        customLinkedList.insertar(40);
        customLinkedList.insertar(500);
        double valor=customLinkedList.returnValue(3);
		assertEquals(valor, 40,0);
	}
	
	/**
	 * Esta prueba verifica que se devuelva la longitud correcta de una lista
	 */
	@Test
	public void TestSize() {
        LinkedList customLinkedList = new LinkedList();
        customLinkedList.insertar(50);
        customLinkedList.insertar(100);
        customLinkedList.insertar(40);
        customLinkedList.insertar(500);
        int valor=customLinkedList.getSize();
		assertEquals(valor, 4);
	}
	
	/**
	 * Esta prueba verifica que se borre un elemento de la lista dada su posicion
	 */
	@Test
	public void TestDel() {
        LinkedList customLinkedList = new LinkedList();
        customLinkedList.insertar(50);
        customLinkedList.insertar(100);
        customLinkedList.insertar(40);
        customLinkedList.insertar(500);
        customLinkedList.borrar(2);
        double valor=customLinkedList.returnValue(2);
		assertEquals(valor, 100,0);
	}
	/**
	 * Esta prueba verifica que la busqueda de un elemento dentro de la lista sea correcta
	 */
	@Test
	public void TestSearch() {
        LinkedList customLinkedList = new LinkedList();
        customLinkedList.insertar(50);
        customLinkedList.insertar(100);
        customLinkedList.insertar(40);
        customLinkedList.insertar(500);
        boolean valor=customLinkedList.buscar(40);
        
		assertEquals(valor, true);
	}
}
