package ejercicio_Tema2_Repaso;

import java.util.Scanner;

public class Ejercicio13 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String frases;
	String espacio = "";
	Boolean fin;
	do {
		System.out.println("Introduzca una frase, para cerrar el bucle escriba fin");
		frases = scanner.nextLine();
		espacio = espacio + frases + " ";
		fin = frases.endsWith("fin");
	}while(!fin);
	System.out.println(espacio);
	scanner.close();
}
}
