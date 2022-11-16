package ejercicio_Tema2_Repaso;

import java.util.Scanner;

public class Ejercicio8 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String texto;
	String interior;
	Integer ultimoEspacio;
	do {
		System.out.println("Introduzca una frase");
		texto = scanner.nextLine();
		if(texto.startsWith("hola") && texto.endsWith("hastaluego")) {
			ultimoEspacio = texto.lastIndexOf("hastaluego");
			interior = texto.substring(5,ultimoEspacio);
			System.out.println("Lo he entendido: " + interior);
		}
		else{
			System.out.println("No te entiendo");
		}
	}while(!(texto.startsWith("hola") || texto.endsWith("hastaluego")));
	scanner.close();
}
}
