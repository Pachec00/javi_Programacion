package ejercicio_Tema2_Repaso;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		Integer aleatorio;
		Integer numerousuario;
		Integer contadorbucle = 0;
		Integer puntuacion = 11;
		aleatorio = random.nextInt(10);
		do {
			System.out.println("Adivina el número entre el 0 y el 9");
			numerousuario = scanner.nextInt();
			contadorbucle = contadorbucle + 1;
		} while (aleatorio != numerousuario);
		System.out.println("Has obtenido " + (puntuacion - contadorbucle) + " puntos");
		scanner.close();
	}
}
