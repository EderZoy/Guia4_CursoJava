package Punto1;

import java.util.Arrays;

public class Ordenar {
	
	char orden;
	int vector[] = new int[3];
	
	//creamos el metodo
	public void mostrarOrdenados(int vector[], char orden) {
						
	Arrays.sort(vector); //ordenamos el vector en forma ascendete				
		
	if (orden =='a') { //Si el orden es ascendente				
		//mostramos el array
		System.out.println("El vector ordenado de menor a mayor es:");
		for (int num : vector){
			System.out.println(num);
		}
							
	} else if (orden == 'b') {
		//mostramos el vector 
		System.out.println("El vector ordenado de mayor a menor es:");
			for (int i=2;i>=0;i--) {
				System.out.println(vector[i]);
			}
							
	}
	}
}
