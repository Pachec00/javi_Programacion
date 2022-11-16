package ejercicio_Tema2_Repaso;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String texto;
		String interior;
		Integer ultimoEspacio;
		do {
			System.out.println("Introduzca una frase");
			texto = scanner.nextLine();
			ultimoEspacio = texto.lastIndexOf("hastaluego");
			interior = texto.substring(4, ultimoEspacio);
			if (texto.startsWith("hola") && texto.endsWith("hastaluego")) {
				System.out.println("Lo he entendido: " + interior);
			}
			else if(!texto.startsWith("hola") && !texto.endsWith("hastaluego")) {
				System.out.println("No te entiendo");
			}
		} while (!texto.endsWith("adios"));
		Integer fin = texto.lastIndexOf("adios");
		String mensajefinal = texto.substring(4,fin);
		System.out.println("Lo he entendido: " + mensajefinal);
		scanner.close();
	}
}
