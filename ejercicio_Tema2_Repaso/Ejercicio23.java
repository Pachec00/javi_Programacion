package ejercicio_Tema2_Repaso;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("¿Cuántas veces tiro el dado?");
		Integer repeticiones = scanner.nextInt();
		for (Integer i = 1; i <= repeticiones; i++) {
			Integer dado = random.nextInt(6);
			dado = dado + 1;
			System.out.println("Intento " + i + " : " + dado);
		}
		scanner.close();
	}
}
