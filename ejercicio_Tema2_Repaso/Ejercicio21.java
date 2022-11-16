package ejercicio_Tema2_Repaso;

import java.util.Scanner;

public class Ejercicio21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer numero;
		do {
			System.out.println("Introduce un número mayor que cero");
			numero = scanner.nextInt();
			for (Integer contador = 1; contador <= numero; contador++) {
				System.out.println();
				for (Integer j = 1; j <= numero; j++) {
					if (contador == j) {
						System.out.print("* ");
					} else {
						System.out.print("- ");
					}
				}
			}
		} while (numero <= 0);
		scanner.close();
	}
}
