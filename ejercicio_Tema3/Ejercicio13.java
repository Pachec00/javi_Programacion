package ejercicio_Tema3;

public class Ejercicio13 {
	public static void main(String[] args) {
		Integer bidimensional[][] = new Integer[10][10];
		Integer multiplicacion;
		Integer x = 0;
		Integer y = 1;
		for (int i = 0; i < bidimensional.length; i++) {
			x++;
			for (int j = 0; j < bidimensional.length; j++) {
				multiplicacion = x * y;
				bidimensional[i][j] = multiplicacion;
				y++;
				if(y>10) {
					y=1;
				}
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
	

