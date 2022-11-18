package ejercicio_Tema3;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca su nombre completo");
		String nombreCompleto = s.nextLine();
		String nombre[] = nombreCompleto.split(" ");
		for (int i = 0; i < nombre.length; i++) {
			System.out.println(nombre[i]);
		}
		s.close();
	}
}
