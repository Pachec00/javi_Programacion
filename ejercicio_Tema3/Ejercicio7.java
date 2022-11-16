package ejercicio_Tema3;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("¿Cuántos números me vas a decir?");
		Integer cantidad = s.nextInt();
		Integer x = cantidad - 1;
		Float numero[] = new Float[cantidad];
		Float numero2[] = new Float[cantidad];
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digame un número");
			numero[i] = s.nextFloat();
		}
		for (int i = 0; i < numero2.length; i++) {
			numero2[i] = numero[x];
			x--;
			if(x==-1) {
				break;
			}
		}
		for (int y = 0; x < numero2.length; y++) {
			if(y==2) {
				break;
			}
			System.out.println(numero2[y]);
		}
		s.close();
	}
}
