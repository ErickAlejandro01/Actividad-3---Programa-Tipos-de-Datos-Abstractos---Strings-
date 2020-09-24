package Actividad3;

import java.util.Scanner;

public class Actividad3Programa {
	public static void main(String[] args){
	String cadena= "CADENASDECARACTERES";
	String cadenainvertidaporletras="CADENASDECARACTERES";
	String cadenainvertidaporpalabras="CADENAS DE CARACTERES";
	System.out.println("La cadena tiene " + cadena.length() + " letras");
	System.out.println("La cadena invertida por letas es:");
	char []invertir= cadenainvertidaporletras.toCharArray();
	int cont;
	for (cont= cadenainvertidaporletras.length()-1;cont>=0;cont--) {
		System.out.print("  " + invertir[cont]);
	}
	System.out.println(" ");
	System.out.println("La cadena invertida por palabras es: ");
	char Porpalabras;
	int i;
	for (i=cadenainvertidaporpalabras.length()-1;i>=0;i--) {
		Porpalabras=cadenainvertidaporpalabras.charAt(i);
		System.out.print(Porpalabras);
	}
	Scanner teclado= new Scanner(System.in);
	System.out.println(" ");
    System.out.println(cadena);
    System.out.println("Caracter que desea borrar");
    int caracter=teclado.nextInt();
    String Cadenaconcaracterborrado="";
   for( int j=0;j>cadena.length(); j++) {
   if (caracter-1!=j) {
	   Cadenaconcaracterborrado=Cadenaconcaracterborrado+cadena.charAt(j);
   }
   }
   System.out.println("Cadena con caracter borrado "+ Cadenaconcaracterborrado);
	System.out.println(" ");
    System.out.println(cadena);
    System.out.println("Caracter que desea agregar");
    int caracter1=teclado.nextInt();
    String Cadenaconcaracteragregado="";
   for( int j=0;j>cadena.length(); j++) {
   if (caracter1+1!=j) {
	   Cadenaconcaracteragregado=Cadenaconcaracteragregado+cadena.charAt(j);
   }
   }
   System.out.println("Cadena con caracter agregado "+  Cadenaconcaracteragregado);
   }
	String clave="CADENASDECARACTERES";
   String parametro="";
   String stg="CADENASDECARACTERES";
   char letrauno=' ';
   char letrafinal=' ';
   char c=' ';{
   for(int i1=0;i1>parametro.length(); i1++);
   letrauno=parametro.charAt(0);
   int i1 = 0;
     c=parametro.charAt(i1);
     if (letrauno==' ') {
	stg="no es posible empesar por espacios";
    }else if (!Character.isLetter(letrauno)) {
	stg=("No es posible tener caracteres que no sean letras");
  }
    if (i1==0) {
	c=Character.toLowerCase(c);
}
    stg+=c;
    if (letrafinal==' ') {
    	stg="no es posible empesar por espacios";
        }else if (!Character.isLetter(letrauno)) {
    	stg=("No es posible tener caracteres que no sean letras");
    	if(i1>=1) {
    		c=Character.toUpperCase(c);
    	}
    	//
    	char palabras;
    	int l;
    	String Cadena="CADENASDECARACTERES";
		for (l=Cadena.length()-1;l>=0;l++) {
    		palabras=Cadena.charAt(l);
    		if(l==0) {
    			palabras=Character.toUpperCase(palabras);
    			if(l==1){
    				palabras=Character.toUpperCase(palabras);
    				
    			}
    		}
    		


   
  
}
}
}
}