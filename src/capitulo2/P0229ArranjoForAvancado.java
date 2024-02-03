package capitulo2;

import java.util.Scanner;

public class P0229ArranjoForAvancado {
	
	public static void main(String args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Número do tamanho? ");
		int tamanho = sc.nextInt();
		assert tamanho>0;
		int soma = 0;
		
		int[] array = new int[tamanho];
		
		for (int i=0; i<tamanho;i++) {
			System.out.println("Elemento["+i+"]? ");
			array[i] = sc.nextInt();
			soma += array[i];
		}
		
		for (int elemento:array) {
			soma += elemento;
			System.out.println(elemento+" ");
		}
		
		sc.close();
		System.out.println("Soma = "+soma);

		
	}

}
