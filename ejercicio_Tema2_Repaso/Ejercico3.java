package ejercicio_Tema2_Repaso;

import java.util.Scanner;

public class Ejercico3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer opcion = 0;
		do {
			System.out.println("*** MENÚ ***");
			System.out.println("1. Abrir");
			System.out.println("2. Guardar");
			System.out.println("3. Modificar");
			System.out.println("4. Salir");
			opcion = scanner.nextInt();
			if(opcion == 4) {
				System.out.println("Bye Bye");
			}
			else if(opcion>=1 && opcion <=3) {
				System.out.println("Ha elegido la opción " + opcion);
			}
			else {
				System.out.println("ERROR");
			}
				
		} while (opcion < 4 || opcion < 0 || opcion > 4);

		
		scanner.close();
	}
}
