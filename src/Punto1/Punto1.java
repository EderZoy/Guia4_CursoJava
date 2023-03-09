package Punto1;
import java.util.Scanner;
import java.util.Arrays;


public class Punto1 {

	public static void main(String[] args) {
		/* 1. Tomando los Ejercicios de la clase anterior
			a. haga un main, donde por parámetro ponga 3 números y una letra que represente ascendente o descendente y los muestre ordenados por tal criterio
			b. haga lo mismo, pero solicitando los parámetros de a uno por consola
			c. lo mismo, pero usando los parámetros si hay alguno (como en a) y haciendo (b) si no detecta ninguno. Vea si con una función puede evitar repetir código.*/
	
		Scanner Teclado = new Scanner(System.in);
		//Definimos variables
		char orden = ' ';
		int vector[] = new int[3];
		
		//Definimos parametros (si es lo queremos asi)
		/*vector[0] = 1;
		vector[1] = 45;
		vector[2] = 34;
		
		orden = 'b';*/
		
		//Si los parametros son nulos se deben ingresar, si ya estan declarados directamente pasamos al metodo. 
		if (vector == null || orden == ' ') {
			//Ingresamos los numeros
			System.out.println("Ingrese los numeros a ordenar");
			for (int i=0;i<3;i++) {
				System.out.println("Ingrese el "+(i+1)+" numero");
				vector[i] = Teclado.nextInt();
			}
	
			//Ingresamos la letra
			System.out.println("Ingrese una de las siguientes letras:"
					+ " - ingrese a: Ordenar en forma ascendente"
					+ " - ingrese b: Ordenar en forma descendente");
		
			orden = Teclado.next().charAt(0); //para ingresar un char
			}
	
		
		
		//llamamos al metodo creando un ojeto de la clase Ordenar
		Ordenar O1 = new Ordenar();
		O1.mostrarOrdenados(vector, orden);

		
	}
	

}
