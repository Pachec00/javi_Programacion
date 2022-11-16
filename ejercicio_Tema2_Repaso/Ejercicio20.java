package ejercicio_Tema2_Repaso;

public class Ejercicio20 {
	public static void main(String[] args) {
		Integer numero = 5;
		for (Integer contador = 1; contador <= numero; contador++) {
			System.out.println();
			for (Integer j = 1; j <= numero; j++) {
				if (contador == j) {
					System.out.print("* ");
				} else {
					System.out.print("- ");
				}
			}
		}
	}
}
