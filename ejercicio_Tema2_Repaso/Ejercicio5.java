package ejercicio_Tema2_Repaso;

public class Ejercicio5 {
	public static void main(String[] args) {
	Integer contador = 1;
		do {
		System.out.print(contador+"_");
		contador++;
		if(contador==20) {
			System.out.print(contador);
		}
		}while(contador<20);
	}
}
