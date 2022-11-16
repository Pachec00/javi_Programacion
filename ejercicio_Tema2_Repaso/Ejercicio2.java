package ejercicio_Tema2_Repaso;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca el nombre de tres ciudades");
		String ciudad1 = scanner.nextLine();
		String ciudad2 = scanner.nextLine();
		String ciudad3 = scanner.nextLine();
		Integer longitud1 = ciudad1.length();
		Integer longitud2 = ciudad2.length();
		Integer longitud3 = ciudad3.length();
		Integer comparacion12 = longitud1.compareTo(longitud2);
		Integer comparacion13 = longitud1.compareTo(longitud3);
		Integer comparacion23 = longitud2.compareTo(longitud3);

		if (comparacion12 < 0 && comparacion13 < 0 && comparacion23 < 0) {
			System.out.println(ciudad1 + "\n" + ciudad2 + "\n" + ciudad3);
		}
		else if (comparacion12 < 0 && comparacion13 < 0 && comparacion23 > 0) {
			System.out.println(ciudad1 + "\n" + ciudad3 + "\n" + ciudad2);
		}
		else if (comparacion12 > 0 && comparacion13 < 0 && comparacion23 < 0) {
			System.out.println(ciudad2 + "\n" + ciudad1 + "\n" + ciudad3);
		}
		else if (comparacion12 > 0 && comparacion13 > 0 && comparacion23 < 0) {
			System.out.println(ciudad2 + "\n" + ciudad3 + "\n" + ciudad1);
		}
		else if (comparacion12 < 0 && comparacion13 > 0 && comparacion23 > 0) {
			System.out.println(ciudad3 + "\n" + ciudad1 + "\n" + ciudad2);
		}
		else{
			System.out.println(ciudad3 + "\n" + ciudad2 + "\n" + ciudad1);
		}
		scanner.close();
	}
	
}
