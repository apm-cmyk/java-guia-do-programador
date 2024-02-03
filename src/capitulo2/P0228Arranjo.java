package capitulo2;

import java.util.Scanner;

public class P0228Arranjo {

	public static void main(String[] args) {
		
		
		/*
		 * <tipo> [] identificador;
		 * <tipo> identificado [];
		 * <tipo>[] identificador = new <tipo>
		 * 
		 * saber o tamanho int d = identificador.length;
		 * indexação selecionar uma posição do vetor
		 */
		
		//todo arranjo em java é preenchido automaticamente como zero, 
		//false booleano e null se for objeto
		
		int[] a = new int[10];
		int soma = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]?");
			a[i] = sc.nextInt();
			soma += a[i];
		}
		
		System.out.println("Soma = "+soma);
		
		sc.close();
	}
}
