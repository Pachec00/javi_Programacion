package ejercicio_Tema2_Repaso;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca dos números para operar");
		Integer numero1 = scanner.nextInt();
		Integer numero2 = scanner.nextInt();
		Integer menu;
		do {
			System.out.println("*** MENÚ ***");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("0. Salir");
			menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.println(numero1 + numero2);
				break;
			case 2:
				System.out.println(numero1 - numero2);
				break;
			case 3:
				System.out.println(numero1 * numero2);
				break;
			case 4:
				if (numero2 == 0) {
					System.out.println("Divison incorrecta");
				} 
				else {
					System.out.println(numero1 / numero2);
				}
				break;
			}
		} while (!(menu == 0));
		System.out.println("Bye");
		scanner.close();
	}
}
