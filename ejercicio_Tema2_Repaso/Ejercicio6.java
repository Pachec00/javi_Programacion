package ejercicio_Tema2_Repaso;

public class Ejercicio6 {
	public static void main(String[] args) {
		Integer contador = 3;
		Integer suma = 0;
		do {
			System.out.print(contador + " + ");
			suma = suma + contador;
			contador = contador + 3;
			if(contador==30) {
				suma = suma + contador;
				System.out.print(contador + " = " + suma);
			}
		}while(contador<30);
	}
}

