package ejercicio_Tema3;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("¿Cuántos números me vas a decir?");
		Integer cantidad = s.nextInt();
		Integer numero[] = new Integer[cantidad];
		Integer comparacion = 0;
		Integer acumulacion = 0;
		Integer media = 0;
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digame un número");
			numero[i] = s.nextInt();
		}
		for (int i = numero.length - 1; i >= 0; i--) {
			System.out.println(numero[i]);
		}
		Integer maximo = numero[0];
		Integer minimo = numero[0];
		Integer posmax = 0;
		Integer posmin = 0;
		for (int i = 0; i < numero.length; i++) {
			if(numero[i]>maximo) {
				maximo = numero[i];
				posmax = i;
			}
			if(numero[i]<minimo){
				minimo = numero[i];
				posmin = i;
			}
			acumulacion = acumulacion + numero[i];
		}
		media = acumulacion/numero.length;
		System.out.println("El numero mayor es " + maximo + " " + posmax);
		System.out.println("El numero menor es " + minimo + " " + posmin);
		System.out.println("La media es " + media);
		s.close();
	}
}
