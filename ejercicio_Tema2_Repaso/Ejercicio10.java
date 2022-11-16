package ejercicio_Tema2_Repaso;

import java.util.Scanner;

public class Ejercicio10 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String web;
	String protocolo;
	String parte1;
	String parte2;
	String parte3;
	Integer pos1;
	Integer punto1;
	Integer punto2;
	Integer longitud;
	do {
		System.out.println("Introduzca una dirección web");
		web = scanner.nextLine();
		pos1 = web.indexOf("://");
		punto1 = web.indexOf(".");
		punto2 = web.lastIndexOf(".");
		longitud = web.length();
		protocolo = web.substring(0,pos1);
		parte1 = web.substring(pos1+3,punto1);
		parte2 = web.substring(punto1+1,punto2);
		parte3 = web.substring(punto2+1,longitud);
		if(pos1 == -1 || punto1 == -1 || punto1 == punto2) {
			System.out.println("Página introducida incorrecta");
			continue;
		}
		System.out.println(protocolo + "://");
		System.out.println(parte1);
		System.out.println(parte2);
		System.out.println(parte3);
	}while(!(web.contains(protocolo) || web.contains(parte1) || web.contains(parte2) || web.contains(parte3)));
	scanner.close();
}
}
