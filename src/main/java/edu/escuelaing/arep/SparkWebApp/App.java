package edu.escuelaing.arep.SparkWebApp;

/**
 * Hello world!
 *
 */
import static spark.Spark.*;

import edu.escuelaing.arep.SparkWebApp.Calcu.Calculadora;
import edu.escuelaing.arep.SparkWebApp.LinkedList.LinkedList;
import spark.Request;
import spark.Response;

public class App {
	static Reader lec;
	static Calculadora calcu;

	public static void main(String[] args) {
		port(getPort());
		get("/inputdata", (req, res) -> inputDataPage(req, res));
		get("/results", (req, res) -> resultsPage(req, res));
	}

	   /**
	    * @param req almacena la peticion del cliente.
	    * @param res almacena la respuesta.
	    * @return pageContent Retorna la respuesta del usuario.
	    */
	    private static String inputDataPage(Request req, Response res) {
	        String pageContent
	                = "<!DOCTYPE html>"
	                + "<html>"
	                + "<title>Calculadora de Media y Desviacion Estandar</title>"
	                + "<body style=\"background-color:#0e0021;\">" + "<style>" 
					+ "div.a {text-align: center;}" + "</style>"
					+ "<div class=\"a\">" + "<h1 style=\"color:#fc9321;\">Calculadora</h1>"
					+ "<h2 style=\"color:#fcfac0;\">En esta aplicacion podra calcular la media y desviacion estandar de una lista de numeros</p>"
					+ "</div>"
	                + "<form action=\"/results\">"
					+ "<div class=\"a\">" + "<fieldset>"					
					+ "<legend style=\"color:#fcfac0; \">INFORMACION</legend>"
					+ "<br><br>"
					+ "<h2 style=\"color:#fcfac0;\"> Ingrese los datos:  <br><br>" + "  <input style=\"font-size:20px;\" type=\"text\"  name=\"Datos\" value=\"1,2,3,4\">" + "  <br>"
	                + "<br><br>"
	                + "<input style=\"width:200px ; font-size:150% ; text-align:center\" type=\"submit\" value=\"Calcular\">"				
					+ "</fieldset>" + "<h2 style=\"color:#fc9321;\">AREP 2021</h2>"
	                + "</form>"
	                + "</body>"
	                + "</html>";
	        return pageContent;
	    }
	   /**
	    * @param req almacena la peticion del cliente.
	    * @param res almacena la respuesta.
	    * @return pageContent Retorna la respuesta del usuario.
	    */
	    private static String resultsPage(Request req, Response res) {
	        LinkedList elementos = new LinkedList();
	        String data = req.queryParams("Datos");
	        String[] lista  = data.split(",");
	        double n;
	        for (String elemento: lista){
	            n = Double.parseDouble(elemento);
	            elementos.insertar(n);
	        }
	        calcu=new Calculadora();
	        String pageResponse
	                = "<!DOCTYPE html>"
	                + "<html>"
	                + "<title>Calculadora de Media y Desviacion Estandar</title>"
	                + "<body style=\"background-color:#0e0021;\">" + "<style>" 
					+ "div.a {text-align: center;}" + "</style>"
					+ "<div class=\"a\">" + "<h1 style=\"color:#fc9321;\">RESULTADOS</h1>"
					+ "<div class=\"a\">" + "<fieldset>"					
					+ "<legend style=\"color:#fcfac0; \">INFORMACION</legend>"
					+ "<br><br>"
					+ "<h2 style=\"color:#fcfac0;\"> La media es:  <br><br>" + calcu.mean(elementos) + "  <br>"
	                + "<br><br>"
					+ "<br><br>"
					+ "<h2 style=\"color:#fcfac0;\"> La desviasion estandar es:  <br><br>" + calcu.standarDeviation(elementos) + "  <br>"
	                + "<br><br>"				
					+ "</fieldset>" + "<h2 style=\"color:#fc9321;\">AREP 2021</h2>"
	                
	                + "</body>"
	                

	                + "<br><br>"
	                + "<a style=\"color:#fcfac0;\" href=\"/inputdata\">Regresar a la Pagina Principal</a>"
	               

	                + "</body>"
	                + "</html>";
	        return pageResponse;
	    }

	/**
	    * Este metodo lee el puerto predeterminado segun lo especificado por la variable PORT en el entorno.
	    * @return returns Retorna el puerto predeterminado si el heroku-port no esta configurado (es decir, en localhost).
	    */
	   static int getPort() {
	       if (System.getenv("PORT") != null) {
	           return Integer.parseInt(System.getenv("PORT"));
	       }
	       return 4567;
	   }
	
}
