package ejercicio_Tema2_Repaso;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca su nombre");
		String nombre = scanner.nextLine();
		System.out.println("Introduzca su año de nacimiento");
		Integer edad = scanner.nextInt();
		Integer N = 2030 - edad;
		System.out.println("Hola " + nombre + ", en el año 2030 tendrás " + N);
		scanner.close();
	}
}
