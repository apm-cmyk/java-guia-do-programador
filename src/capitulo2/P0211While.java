package capitulo2;

import java.util.Scanner;

public class P0211While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor inteiro inicial? ");
		int j = sc.nextInt();
		
		while (j>=0) {
			System.out.println(j);
			j--;
		}
		
		sc.close();
	}

}

//Java guia do desenvolvedor
//Algoritmo em Java - Sandra Purga
//Arquitetura de software em Java
//Java Efetivo
//Front end: angular e spring boot (programação web)
//JavaFX
//Programação Android (é o que interessa)
//Kotlin




