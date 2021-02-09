package edu.escuelaing.arep.SparkWebApp;

import static spark.Spark.get;
import static spark.Spark.port;

import java.io.File;
import java.util.Scanner;

public class Reader {
	String toto="";
	public Reader() {

	}
	public String getString(String ruta)
	{
        try {
            Scanner input = new Scanner(new File(ruta));
            toto="";
            while (input.hasNextLine()) {
                String line = input.nextLine();
                toto=toto+line;
            }
            input.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(toto);
		return toto;
	}
    

}
