package capitulo2;

import java.util.Scanner;

public class ExerciciosRevisaoCapitulo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

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
	
		
		sc.close();
	}
	

}
