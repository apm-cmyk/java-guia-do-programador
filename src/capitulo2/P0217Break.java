package capitulo2;

import java.util.Scanner;

public class P0217Break {

	public static void main(String[] args) {
		
		System.out.println("maximo numero de pares?");
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int pares = 0;
		
		for (int i=0; i<1000; i++) {
			if (i%2==0) {
				pares++;
				System.out.printf("i = %4d pares = %4d%n", i, pares);
			}
			if (pares==max) {break;}
		}
		sc.close();
	}

}
