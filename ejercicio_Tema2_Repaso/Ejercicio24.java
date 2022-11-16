package ejercicio_Tema2_Repaso;

import java.util.Scanner;

public class Ejercicio24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer numero;
		Integer suma = 0;
		Integer contador = 1;
		Integer resto;
		do {
			System.out.println("Introduzca un número mayor que 0");
			numero = scanner.nextInt();
		} while (numero <= 0);
		do {
			resto = contador % 2;
			if (resto == 1) {
				suma = suma + contador;
			}
			contador++;
		} while (contador <= numero);
		System.out.println("La suma de los numeros impares es: " + suma);
		scanner.close();
	}
}
