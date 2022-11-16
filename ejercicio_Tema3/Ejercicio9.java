package ejercicio_Tema3;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Quants números em diràs?");
		Integer cantidad = s.nextInt();
		Integer numero[] = new Integer[cantidad];
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Diga'm un número");
			numero[i] = s.nextInt();
		}
		Integer aux = 0;
		Integer aux2 = 0;
		for (int i = 0; i < numero.length; i++) {
			for (int j = i; j < numero.length; j++) {
				if (numero[j] < numero[i]) {
					aux = numero[i];
					aux2 = numero[j];
					numero[i] = aux2;
					numero[j] = aux;
				}
			}
		}
		for (int x = 0; x < numero.length; x++) {
			System.out.print(numero[x] + " ");
		}
		s.close();
	}
}
