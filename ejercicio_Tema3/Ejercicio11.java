package ejercicio_Tema3;

public class Ejercicio11 {
	public static void main(String[] args) {
		Integer [][] bidimensional = new Integer [10][5];
		Integer x = 1;
		for (int i = 0; i < bidimensional.length-5; i++) {
			for (int j = 0; j < bidimensional.length; j++) {
				bidimensional[j][i] = x;
				x++;
			}
		}
		for (int i = 0; i < bidimensional.length-5; i++) {
			System.out.println();
			for (int j = 0; j < bidimensional.length; j++) {
				System.out.print(bidimensional[j][i] + "\t");				
			}
		}
		
	}
}
