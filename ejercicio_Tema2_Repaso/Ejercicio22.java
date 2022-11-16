package ejercicio_Tema2_Repaso;

import java.util.Scanner;

public class Ejercicio22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (Integer x = 1; x <= 10; x++) {
			System.out.println(x);
			String enter = scanner.nextLine();
		}
		scanner.close();
	}
}
