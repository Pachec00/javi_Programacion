package ejercicio_Tema2_Repaso;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer numero = 0;
		Integer numero2 = numero;
		Integer suma = 0;
		do {
			System.out.println("Introduzca un número entre 1 y 10");
			numero = scanner.nextInt();
			numero2 = numero;
			if (numero > 0 && numero <= 10) {
				do {
				System.out.print(numero2 + " + ");
				suma = suma + numero2;
				numero2 = numero + numero2;
				if (numero2 == (numero * 10)) {
					suma = suma + numero2;
					System.out.print(numero2 + " = " + suma);
					System.out.println("\n");
					}
				}while(numero2<(numero*10));
				}
			if (numero < 0 || numero > 10) {
				System.out.println("ERROR");
			}
		} while(numero!=0);
		System.out.println("Bye bye");
		scanner.close();
	}
}

