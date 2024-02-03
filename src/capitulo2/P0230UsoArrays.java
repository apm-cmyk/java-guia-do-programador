package capitulo2;

import java.util.Arrays;
import java.util.Scanner;

public class P0230UsoArrays {

	public static void main(String[] args) {
		
		//metodos para operação das classes arrays
		
		/* 1) metodo fill 
		 * 	  para preenchmento automatico sem precisar do for
		 * 2) metodo equals para comparação de duas arrays
		 * 3) metodo copyOf(nomeArray,numElementos)
		 * 	  metodo copyOfRange(nomeArray, posicaoInicial, posicaoFinal)
		 * 	  copyRange = copia de um array a partir de uma posição
		 *    copyOf = copia completa de uma array 
		 * 4) metodo toString 
		 * 5) toString, Fill, copyOf e copyOfRange (tem em qualquer derivado do Object)
		   6) metodo Sort para ordenação de Arrays
		   	  sort(arranjo) ou sort(arranjo,de, para)
		   	  o metodo sort a ordenação é ascendente ele usa o
		   	  algoritmo QuickSort
		   7) para outros tipos de ordenaçao é usado a interface Comparator<T>
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero do elemento? ");
		int tamanho = sc.nextInt();
		System.out.println("Preenchimento real? ");
		double valor = sc.nextDouble();
		double[] arranjo= new double[tamanho];
		Arrays.fill(arranjo, valor); //preeche o arranjo
		System.out.println(Arrays.toString(arranjo)); //exibe o arranjo
		System.out.println("Posicao inicial copia: ");
		int de = sc.nextInt();
		System.out.println("Posicao final copia: ");
		int para = sc.nextInt();
		
		double[] arranjo2 = Arrays.copyOf(arranjo, arranjo.length);
		double[] arranjo3 = Arrays.copyOfRange(arranjo, de,para);
		System.out.println("Copia parcial: "+Arrays.toString(arranjo3));
		System.out.println("Copia total: "+Arrays.toString(arranjo2));

		System.out.println("digite os valores a serem ordenados: ");
		double[] arranjo4 = new double[5];
		for (int i=0;i<arranjo4.length;i++) {
			System.out.println("arranjo4["+i+"]: ");
			arranjo4[i] = sc.nextDouble();
		}
		
		System.out.println("Arranjo original: "+Arrays.toString(arranjo4));

		Arrays.sort(arranjo4);
		
		System.out.println("Arranjo ordenado: "+Arrays.toString(arranjo4));
		sc.close();

	}

}
