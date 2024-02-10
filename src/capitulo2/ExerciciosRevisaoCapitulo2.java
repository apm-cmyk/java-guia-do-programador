package capitulo2;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciciosRevisaoCapitulo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
/*
		//Exercicio 1
		//Exercicio 2
		System.out.printf("Exercicio 2%n");
		System.out.println("Ana Paula Marinho");
		//Exercicio 3
		System.out.printf("%nExercicio 3%n");
		System.out.print("Digite um valor inteiro: ");
		int int1 = sc.nextInt();
		System.out.printf("%nDigite um valor real: ");
		float real = sc.nextFloat();
		System.out.printf("Valor inteiro: %d Valor real: %f%n",int1, real);
		//Exercicio 4
		System.out.printf("%nExercicio 4%n");
		System.out.print("Digite um valor inteiro: ");
		int int2 = sc.nextInt();
		int aux = 0;
		while(aux<=int2) {
			System.out.println(aux);
			aux++;
		}
		//Exercicio 5
		System.out.printf("%nExercicio 5%n");
		System.out.print("Digite um valor inteiro: ");
		int int3 = sc.nextInt();
		
		if(int3%2 == 0) {
			System.out.println("Numero par!");
		}else {System.out.println("Numero impar!");}
		
		////Exercicio 6
		System.out.printf("%nExercicio 6%n");
		System.out.printf("Digite a largura: ");
		double largura = sc.nextDouble();
		System.out.printf("Digite a altura: ");
		double altura = sc.nextDouble();
		
		System.out.printf("%n area = %f  perimetro = %f",largura*altura,2*(largura+altura));
	
		////Exercicio 7
		System.out.printf("%nExercicio 7%n");
		double soma=0;
		int invalido = 0;
		for (int i=0; i<args.length; i++) {
			
			try {
				soma = Double.parseDouble(args[i]);
			}catch(NumberFormatException e) {
				
				invalido++;
			}
			
		}
	
		////Exercicio 8
		System.out.printf("%nExercicio 7%n");
		double valorMes = 500;
		double montante = 50000;
		double juros = 0.005;
		int numMes = 0;
		double acumulado = 0;
		
		do {
		    acumulado = ((1 + juros) * acumulado) + valorMes;
		    System.out.printf("acumulado = %f qt_mes = %d%n", acumulado, numMes);
		    numMes++;
		} while (acumulado < montante);
	
		System.out.printf("%ntotal = %f montante = %f qt_mes = %d qt_anos = %d",acumulado,montante,numMes, numMes/12);
		
		
		////Exercicio 9
		System.out.printf("%nExercicio 9%n");
		System.out.printf("R = ");
		double r = sc.nextDouble();
		System.out.printf("S = ");
		double s = sc.nextDouble();
		System.out.printf("T = ");
		double t = sc.nextDouble();
		
		double maior;
		
		if (s>r) {
			maior = s;
		}else {
			maior = r;
		}if(t>maior) {
			maior = t;
		}
		System.out.println("maior = "+maior);
		
		
		
		
		////Exercicio 13
		System.out.printf("%nExercicio 13%n");
		System.out.printf("digite um numero inteiro: ");
		int n = sc.nextInt();
		int fatorial = 1;	
		for (int i=0;i<n;i++) {
		fatorial = fatorial*(n-i);
		}
		System.out.printf("%nfatorial de %d eh = %d",n,fatorial);
		
		sc.close();
		
		
		
		////Exercicio 14
		System.out.printf("%nExercicio 14%n");
		System.out.printf("Digite um inteiro N:");	
		int N1 = sc.nextInt();
		double soma=0;
		String texto = "";
		for (int i=1; i<=N1;i++) {
			if (i%2==0) {
				soma -=(1.0/i); //como soma é double para garantir a divisao correta colocar 1.0
				
			}else {soma += 1.0/i;}	
			
			texto += " "+ soma;
		}
		
		System.out.println(texto);
		System.out.println("Soma = "+soma);
		
		*/
		
		
	////Exercicio 15
	System.out.printf("%nExercicio 15%n");
	System.out.printf("Digite um inteiro N:");
	int N2 = sc.nextInt();
	int[] vetor1 = new int[N2];
	int[] vetor2 = new int[N2];

	for (int i=0; i<N2;i++) {
		System.out.printf("%nDigite o vetor[%d]: ",i);
		vetor1[i] = sc.nextInt();
	}
	
	vetor2 = Arrays.copyOf(vetor1,vetor1.length); //copia o vetor 
	Arrays.sort(vetor2); // ordena o vetor
	
	System.out.printf("%nVetor original: "+Arrays.toString(vetor1));

	if(Arrays.equals(vetor2,vetor1)) {
		System.out.printf("%nVetor ordenado!");
	}else {
		
		System.out.printf("%nVetor desordenado!%n");
		System.out.println("Vetor ordenado: "+Arrays.toString(vetor2));
	}
	
	
	
	sc.close();
	}
	
	
	

}
