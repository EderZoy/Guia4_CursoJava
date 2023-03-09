package Punto3;

import java.io.FileWriter;
import java.io.IOException;

public class codificador {
	char abecedario[] = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
    char abecedario2[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z',' '};
    
    //METODO PARA CODIFICADOR Y DECODIFICAR
    
    public void coddec(char opcion, char desplazo, char vectorTexto[], FileWriter escritura) throws IOException {
    	
    	if(opcion == 'c') { //opcion codificar
    		
    		//opcion desplazo 1 
    		if(desplazo == '1') { 
    			String codificado="";
    			//Debemos pasar el texto a codificar a un uevo vector para comparar luego
    		   	 char textoCodificar[] = new char[vectorTexto.length];
    		   	 
    		   	 //Le asignamos el texto al vector
    		   	 for (int i=3;i<vectorTexto.length;i++) {
    		   		 textoCodificar[i]=vectorTexto[i]; //almacenamos el texto 
    		   	 }
    		   	 
    		   	for (int i=0;i<textoCodificar.length;i++) {
    		   		 for (int j=0;j<abecedario.length;j++) {
    		   			 if(textoCodificar[i]==abecedario[j]) {
    		   				 codificado=codificado+abecedario[j+1]; //Asignamos una letra +1 de desplazo
    		   			 }
    		   		 }
    		   	 }
    		   	 
    		   	 System.out.println("La palabra ha sifo codificada con exito, puede verla en el archivo salida.txt");
    		   	 //almacenamos la codificacion en el archivo de salida
    		   	 for(int i=0;i<codificado.length();i++) {
    		   		 escritura.write(codificado.charAt(i));
    		   	 }
    		 
    		   	 //OPCION DESPLAZO 2 
    		} else if(desplazo == '2') { //opcion desplazo 2
    			String codificado="";
    			//Debemos pasar el texto a codificar a un uevo vector para comparar luego
    		   	 char textoCodificar[] = new char[vectorTexto.length];
    		   	 
    		   	 //Le asignamos el texto al vector
    		   	 for (int i=3;i<vectorTexto.length;i++) {
    		   		 textoCodificar[i]=vectorTexto[i]; //almacenamos el texto 
    		   	 }
    		   	for (int i=0;i<textoCodificar.length;i++) {
    		   		 for (int j=0;j<abecedario.length;j++) {
    		   			 if(textoCodificar[i]==abecedario[j]) {
    		   				 codificado=codificado+abecedario[j+2]; //Asignamos una letra +2 de desplazo
    		   			 }
    		   		 }
    		   	 }
    		   	 
    		   	 System.out.println("La palabra ha sifo codificada con exito, puede verla en el archivo salida.txt");
    		   	 //almacenamos la codificacion en el archivo de salida
    		   	 for(int i=0;i<codificado.length();i++) {
    		   		 escritura.write(codificado.charAt(i));
    		   	 }
    		}
    		
    		//DECODIFICADOR 
    	} else if(opcion == 'd') { //opcion decodificar 
    		if(desplazo == '1') { //opcion desplazo 1 
    			String decodificado="";
    			//Debemos pasar el texto a codificar a un uevo vector para comparar luego
    		   	 char textoDecodificar[] = new char[vectorTexto.length];
    		   	 
    		   	 //Le asignamos el texto al vector
    		   	 for (int i=3;i<vectorTexto.length;i++) {
    		   		 textoDecodificar[i]=vectorTexto[i]; //almacenamos el texto 
    		   	 }
    		   	 
    		   	for (int i=0;i<textoDecodificar.length;i++) {
    		   		 for (int j=0;j<abecedario2.length;j++) {
    		   			 if(textoDecodificar[i]==abecedario2[j]) {
    		   				 decodificado=decodificado+abecedario2[j-1]; //Asignamos una letra +1 de desplazo
    		   			 } 
    		   		 }
    		   	 }
    		   	 System.out.println("La palabra ha sifo decodificada con exito, puede verla en el archivo salida.txt");
    		   	 //almacenamos la codificacion en el archivo de salida
    		   	 for(int i=0;i<decodificado.length();i++) {
    		   		 escritura.write(decodificado.charAt(i));
    		   	 }
    		   	 
    		} else if(desplazo == '2') { //opcion desplazo 2
    			String decodificado="";
    			//Debemos pasar el texto a codificar a un uevo vector para comparar luego
    		   	 char textoDecodificar[] = new char[vectorTexto.length];
    		   	 
    		   	 //Le asignamos el texto al vector
    		   	 for (int i=3;i<vectorTexto.length;i++) {
    		   		 textoDecodificar[i]=vectorTexto[i]; //almacenamos el texto 
    		   	 }
    		   	 
    		   	for (int i=0;i<textoDecodificar.length;i++) {
    		   		 for (int j=0;j<abecedario2.length;j++) {
    		   			 if(textoDecodificar[i]==abecedario2[j]) {
    		   				 decodificado=decodificado+abecedario2[j-2]; //Asignamos una letra +1 de desplazo
    		   			 } 
    		   		 }
    		   	 }
    		   	 System.out.println("La palabra ha sifo decodificada con exito, puede verla en el archivo salida.txt");
    		   	 	//almacenamos la codificacion en el archivo de salida
    		   	 for(int i=0;i<decodificado.length();i++) {
    		   		 escritura.write(decodificado.charAt(i));
    		   	 } 
    		}
    	}
    }
}
