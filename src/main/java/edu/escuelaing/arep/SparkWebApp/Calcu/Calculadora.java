package edu.escuelaing.arep.SparkWebApp.Calcu;

import edu.escuelaing.arep.SparkWebApp.LinkedList.LinkedList;

/**
 * Esta clase se encarga de implementar los metodos para calcular correctamente el promedio y la desviacion estandar de una linkedlist
 * @author  Jonathan Fabian Paez Torres
 * @version 1.0
 */
public class Calculadora {
	private double sumvalLista=0;
	public LinkedList lis1= new LinkedList();
	
    /**
     * Metodo que calcula la suma de todos los elementos de una linkedlist
     * @param list lista a la cual se va a operar
     */
	private void calculateSum(LinkedList list)
	{
		double sum=0;
		for (int i=1;i<=list.getSize();i++)
		{
			sum=sum+list.returnValue(i);	
		}
		this.sumvalLista=sum;
	}
	
    /**
     * Metodo encargado de calcular el promedio de una linkedlist.
     * @param list lista a la cual se quiere obtener el promedio.
     * @return double
     */
	public double mean(LinkedList list)
	{
		
		this.calculateSum(list);
		double avg=this.sumvalLista/list.getSize();
		avg = Math.round(avg * 100);
		avg = avg/100;
		return avg;
	}
	
    /**
     * Metodo encargado de calcular la desviacion estadar de una LinkedList
     * @param list lista de la cual se quiere obtener la desviacion estandar.
     * @return double
     */
	public double standarDeviation(LinkedList list)
	{
		
		double devst=0;
		double sum=0;
		double mean=this.mean(list);
		for (int i=1;i<=list.getSize();i++)
		{
			sum=sum+Math.pow((list.returnValue(i)-mean), 2);	
		}
		double div=sum/(list.getSize()-1);
		devst=Math.sqrt(div);
		devst = Math.round(devst * 100);
		devst = devst/100;
		return devst;
	}
	
    /**
     * Metodo encargado de devolver la suma de los elementos de una lista.
     * @return double
     */
	public double getSumvalLista() {
		return sumvalLista;
	}






}
