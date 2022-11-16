package ejercicio_Tema2_Repaso;

import java.util.Scanner;

public class Ejercicio4 {
	public static final Double Descuento1 = 0.10;
	public static final Double Descuento2 = 0.20;
	public static final Double Descuento3 = 0.40;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca las unidades");
		Integer unidades = scanner.nextInt();
		System.out.println("Introduzca el precio");
		Double precio = scanner.nextDouble();
		Double total = unidades*precio;
		Double descuento1 = total*Descuento1;
		Double descuento2 = total*Descuento2;
		Double descuento3 = total*Descuento3;
		Double totaldescuento1 = total-descuento1;
		Double totaldescuento2 = total-descuento2;
		Double totaldescuento3 = total-descuento3;
		if(unidades<=10) {
			System.out.println("Subtotal = " + unidades + " x " + precio + " = " + total);
			System.out.println("Descuento = 0% de " + total + " = 0");
			System.out.println("Total = " + total + " - 0" + " = " + total);
		}
		else if(unidades>10 && unidades<=24) {
			System.out.println("Subtotal = " + unidades + " x " + precio + " = " + total);
			System.out.println("Descuento = 10% de " + total + " = " + descuento1);
			System.out.println("Total = " + total + " - " + descuento1 + " = " + totaldescuento1);
		}
		else if(unidades>25 && unidades<=100) {
			System.out.println("Subtotal = " + unidades + " x " + precio + " = " + total);
			System.out.println("Descuento = 20% de " + total + " = " + descuento2);
			System.out.println("Total = " + total + " - " + descuento2 + " = " + totaldescuento2);
		}
		else {
			System.out.println("Subtotal = " + unidades + " x " + precio + " = " + total);
			System.out.println("Descuento = 40% de " + total + " = " + descuento3);
			System.out.println("Total = " + total + " - " + descuento3 + " = " + totaldescuento3);
		}
		scanner.close();
	}
}
