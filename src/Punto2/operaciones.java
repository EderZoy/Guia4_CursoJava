package Punto2;
import java.io.IOException;
import java.util.Scanner;

public class operaciones {

	public static void main(String[] args) throws IOException {
		/*2. Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
			contener números. El programa debe escribir por consola la suma de esos números
			
			a. Al programa anterior agreguele un parámetro para que la operación pueda ser suma o multiplicación.*/
		
	    //Leemos el archivo 
		String archivo = "C:\\Users\\Usuario\\eclipse-workspace\\Guia4_CursoJav\\numeros.txt" ;
		
		//Solicitamos la seleccion de la operacion
		int opcion = 0; //Si es 1 es suma, 2 es multiplicacion
		System.out.println("Ingrese la opcion: \n"
				+ "1 - Sumar \n"
				+ "2 - Multiplicar");
		Scanner Teclado = new Scanner(System.in);
		opcion = Teclado.nextInt(); //para ingresar un char
		
		//creamos el objeto y llamamos al metodo
		operacion o1 = new operacion();
		o1.op(archivo, opcion);
		
	
	}

	
}

