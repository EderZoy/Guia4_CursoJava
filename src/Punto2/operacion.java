package Punto2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class operacion {
	
	//DEFINIMOS VARIABLES
	double suma = 0;
	double multiplicacion=1;
	double numero;
	
	
	//DEFINIMOS EL METODO
	public void op(String archivo, int opcion) throws IOException {
		System.out.println("Los numeros del archivo son:");
		for (String linea : Files.readAllLines(Paths.get(archivo))){
			System.out.println(linea);
			//pasar de String a Double
			numero = Double.parseDouble(linea); //pasamos a double
			
			if (opcion == 1) {
				suma = suma + numero; //sumamos 
				
			} else if(opcion == 2) {
				multiplicacion = multiplicacion*numero;
				
			}
			
			
		} 
		//mostramos el resultado2
		
		if (opcion == 1) {
			System.out.println("La suma de los números es: " +suma);
		}
		if (opcion ==2) {
			System.out.println("La multiplicacion de los números es: " +multiplicacion);
		}
		
		
	}
}
