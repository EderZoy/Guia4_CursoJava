package Punto3;

import java.io.BufferedReader;
import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Principal3 {

	public static void main(String[] args) throws IOException {
		/*3. Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una
		codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y
		otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los
		resultados deben estar en el archivo de salida*/
		
		//definimos las variables
		//BufferedReader br = null; 
		File entrada = null;
	    FileReader fr = null;
	  
		char opcion;
		char desplazo;	
		
		//Leemos el archivo de entrada
		entrada = new File("C:\\Users\\Usuario\\eclipse-workspace\\Guia4_CursoJav\\entradacodificacion.txt");
		fr = new FileReader (entrada);
		//br = new BufferedReader(fr);
		char vectorTexto[] = new char[14]; //creamos el vector para almacenar los caracteres
		  
		//Archivo de salida 
		FileWriter escritura = new FileWriter("C:\\Users\\Usuario\\eclipse-workspace\\Guia4_CursoJav\\salida.txt");
		
		
		// Lectura del fichero
		int c = 0;
		int i = 0;
		while(c>=0){ //Mientras no llegue al final
			c = fr.read();
			if (c>0) { //para quitar el -1 del final 
				i++;
			char letra = (char)c; //Pasamos del codigo entero a la letra 
			System.out.println(letra);
			vectorTexto[i] = letra;	
			}
			
		}
		
		//asignamos los valores a las variables
		opcion = vectorTexto[1];
		desplazo = vectorTexto[2];
		
		System.out.println("Ustes a elegido la opcion: "+opcion+" con desplazdo de: "+desplazo);
		
		//llamamos al metodo 
		codificador Co1 = new codificador();
		Co1.coddec(opcion, desplazo, vectorTexto, escritura);
		
		fr.close(); //cerramos el uso del archivo de entrada
		escritura.close(); //cerramos el uso del archivo de salida
		

		}
	
	
        
	

}
