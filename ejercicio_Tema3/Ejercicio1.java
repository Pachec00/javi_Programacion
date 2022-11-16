package ejercicio_Tema3;

public class Ejercicio1 {
	public static void main(String[] args) {
		Integer numero[] = new Integer[15];
		Integer x = 0;
		for (int i = 1; i <= 30; i++) {
			if (i % 2 == 0) {
				numero[x] = i;
				x = x + 1;
			}
		}
		for (int i = 0; i < numero.length; i++) {
			System.out.println(numero[i]);
		}
	}
}
