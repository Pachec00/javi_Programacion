package ejercicio_Tema2_Repaso;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio25 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		/*
		 * 1 --> Piedra 2 --> Papel 3 --> Tijeras
		 */
		String opcionUsuario;
		Integer opcionJuego;
		do {
			System.out.println("Piedra, papel, tijera... un, dos, tres... ya!!");
			opcionJuego = random.nextInt(1, 3);
			System.out.println("Dime que vas a elegir");
			opcionUsuario = scanner.nextLine().toLowerCase();
			System.out.println(opcionJuego);
		} while (!opcionUsuario.equals("piedra") || !opcionUsuario.equals("papel") || !opcionUsuario.equals("tijeras"));
		if (opcionUsuario.equals("piedra")) {
			switch (opcionJuego) {
			case 1:
				System.out.println("Empate");
				break;
			case 2:
				System.out.println("Has perdido");
				break;
			case 3:
				System.out.println("Has ganado");
				break;
			}
		} else if (opcionUsuario.equals("papel")) {
			switch (opcionJuego) {
			case 1:
				System.out.println("Has ganado");
				break;
			case 2:
				System.out.println("Empate");
				break;
			case 3:
				System.out.println("Has perdido");
				break;
			}
		} else if (opcionUsuario.equals("tijeras")) {
			switch (opcionJuego) {
			case 1:
				System.out.println("Has perdido");
				break;
			case 2:
				System.out.println("Has ganado");
				break;
			case 3:
				System.out.println("Empate");
				break;
			}
		}
		scanner.close();
	}
}
