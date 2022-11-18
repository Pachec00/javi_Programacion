package ejercicio_Tema3;

public class Ejercicio12 {
	public static void main(String[] args) {
		Integer bidimensional[][] = new Integer[10][10];
		Integer multiplicacion;
		for (int i = 0; i < bidimensional.length; i++) {
			for (int j = 0; j < bidimensional.length; j++) {
				multiplicacion = i * j;
				bidimensional[i][j] = multiplicacion;
			}
		}
		for (int i = 0; i < bidimensional.length; i++) {
			System.out.println();
			for (int j = 0; j < bidimensional.length; j++) {
				System.out.print(bidimensional[i][j] + "\t");
			}
		}
	}
}
