package ejercicio_Tema2_Repaso;

import java.util.Scanner;

public class Ejercicio18 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Introduzca una palabra");
	String palabra =  scanner.nextLine();
	Integer x;
	for(Integer y=palabra.length();y>0;y--) {
		x = y-1;
		System.out.print(palabra.substring(x,y));
	}

	scanner.close();
}
}
