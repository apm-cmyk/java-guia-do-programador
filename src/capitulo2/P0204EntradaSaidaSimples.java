package capitulo2;


import java.util.Scanner;

public class P0204EntradaSaidaSimples {

	public static void main(String[] args) {
		
		/* Entrada não formatada/*
		 * System.in.read() in-> objeto da classe System
		 * 					read() -> método da classe System
		 */
		/* Saida não formatada/*
		 * System.out.println out -> objeto da classe System
		 * 					println() -> metodo da classe System
		 */
		
		//syso + crtl + espaço add comando System.out.println()
		
		System.out.println("Hello World");
		System.out.println("Digite um inteiro:");
		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();
		System.out.println("Valor digitado: "+valor);
		sc.close();

		
	}

}
