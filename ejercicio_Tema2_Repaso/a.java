package ejercicio_Tema2_Repaso;

import java.util.Scanner;

public class a {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("*MENÚ* \n" + "1.Abrir \n" + "2.Guardar \n" + "3.Modificar \n" + "4.Salir \n");
		Integer opcion = scanner.nextInt();

		while (opcion < 4) {
			System.out.println("Ha elegido la opcion " + opcion);
			System.out.println("*MENÚ* \n" + "1.Abrir \n" + "2.Guardar \n" + "3.Modificar \n" + "4.Salir \n");
			opcion = scanner.nextInt();
		}
		if (opcion == 4) {
			System.out.println("Bye Bye");
		}
		while (opcion > 4) {
			System.out.println("Eleccion incorrecta");
			System.out.println("*MENÚ* \n" + "1.Abrir \n" + "2.Guardar \n" + "3.Modificar \n" + "4.Salir \n");
			opcion = scanner.nextInt();

			while (opcion < 4) {
				System.out.println("Ha elegido la opcion " + opcion);
				System.out.println("*MENÚ* \n" + "1.Abrir \n" + "2.Guardar \n" + "3.Modificar \n" + "4.Salir \n");
				opcion = scanner.nextInt();
			}

			if (opcion == 4) {
				System.out.println("Bye Bye");
			}

		}

		scanner.close();

	}
}
