package ejercicio_Tema2_Repaso;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca un numero mayor que cero");
		Integer numero = scanner.nextInt();
		System.out.print(" __");
		for (Integer x = 1; x < numero; x++) {
			System.out.print("___");
		}
		System.out.println();
		for (Integer y = 1; y <= numero; y++) {
			for (Integer x = 1; x <= numero; x++) {
				System.out.print("|__");
				if (x == numero) {
					System.out.print("|");
					System.out.println();
				}
			}
		}
		scanner.close();
	}
}
