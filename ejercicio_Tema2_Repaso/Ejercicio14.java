package ejercicio_Tema2_Repaso;

import java.util.Scanner;

public class Ejercicio14 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String palabra;
	String contraseña = "";
	do {
		System.out.println("Introduzca una palabra de 8 caracteres.");
		palabra = scanner.nextLine();
		contraseña = palabra.replaceAll("a", "4").replaceAll("e", "3").replaceAll("i", "1").replaceAll("o", "0").replaceAll("t", "7");
	}while((palabra.length()>8));
	System.out.println(contraseña);
	scanner.close();
}
}
