package ejercicio_Tema3;

import java.util.Scanner;

public class Ejercicios3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("¿Cuántos números me vas a decir?");
		Integer cantidad = s.nextInt();
		Float numero[] = new Float[cantidad];
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digame un número");
			numero[i] = s.nextFloat();
		}
		for (int x = 0; x < numero.length; x++) {
			System.out.println(numero[x]);
		}
		s.close();
	}
}
