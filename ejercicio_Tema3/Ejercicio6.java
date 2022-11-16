package ejercicio_Tema3;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String numero[] = new String[3];
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Introduceme una palabra");
			numero[i] = s.nextLine();
		}
		for (int i = 0; i < numero.length; i++) {
			System.out.print(numero[i] + " ");
		}
		s.close();
	}
}
