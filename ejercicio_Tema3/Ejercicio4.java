package ejercicio_Tema3;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("¿Cuántos números me vas a decir?");
		Integer cantidad = s.nextInt();
		Integer numero[] = new Integer[cantidad];
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digame un número");
			numero[i] = s.nextInt();
		}
		for (int i = numero.length-1; i >= 0; i--) {
			System.out.println(numero[i]);
		}
		s.close();
	}
}
