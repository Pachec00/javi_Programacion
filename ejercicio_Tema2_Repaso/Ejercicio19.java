package ejercicio_Tema2_Repaso;

import java.util.Scanner;

public class Ejercicio19 {
	public static final Double pesetaEuro = 0.0060;
	public static final Double euroPeseta = 166.3860;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer seleccion;
		Double cantidad;
		do {
		System.out.println("1 - Pasar de Pesetas a Euros");
		System.out.println("2 - Pasar de Euros a Pesetas");
		System.out.println("3 -  Salir");
		seleccion = scanner.nextInt();
		switch (seleccion) {
		case 1:
			System.out.println("Ha seleccionado Pasar de Pesetas a Euros");
			System.out.println("Introduzca una cantidad para convertir");
			cantidad = scanner.nextDouble();
			System.out.println(cantidad*pesetaEuro);
			continue;
		case 2:
			System.out.println("Ha seleccionado Pasar de Euros a Pesetas");
			System.out.println("Introduzca una cantidad para convertir");
			cantidad = scanner.nextDouble();
			System.out.println(cantidad*euroPeseta);
			continue;
		}
		}while(seleccion!=3);
		System.out.println("Adios");
		scanner.close();
	}
}
