package ejercicio_Tema3;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("¿Cuántos números me vas a decir?");
		Integer cantidad = s.nextInt();
		Float z;
		Float numero[] = new Float[cantidad];
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digame un número");
			numero[i] = s.nextFloat();
		}
		for (int i = 0 , j=1; i < numero.length-1 && j< numero.length-1; i++, j++) {
			z = numero[i];
			numero[i] = numero[numero.length-j];
			numero[numero.length-j] = z;
		}
		for (int x = 0; x < numero.length; x++) {
			System.out.println(numero[x]);
		}
		s.close();
	}
}
