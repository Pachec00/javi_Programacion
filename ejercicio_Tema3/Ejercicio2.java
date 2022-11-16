package ejercicio_Tema3;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Float cuadrados[] = new Float[6];
		Float numeros;
		for (int i = 0; i < cuadrados.length; i++) {
			System.out.println("Dime un número y te doy el cuadrado");
			numeros = s.nextFloat();
			cuadrados[i] = (numeros*numeros);
		}
		for (int i = 0; i < cuadrados.length; i++) {
			System.out.println(cuadrados[i]);
		}
		s.close();
	}
}
