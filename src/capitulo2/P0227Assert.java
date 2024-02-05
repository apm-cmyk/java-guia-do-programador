package capitulo2;

import java.util.Scanner;

public class P0227Assert {

	public static void main(String[] args) {
		
		/*as asserções (assertions) são uma forma de verificar 
		 * as suposições feitas pelo programador durante 
		 * o desenvolvimento. Elas são usadas para testar condições 
		 * que o programador acredita que sempre serão verdadeiras 
		 * em um determinado ponto do programa. 
		 * As asserções são frequentemente utilizadas como uma 
		 * ferramenta de depuração e para verificar a consistência 
		 * interna do programa.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Forneca um inteiro > 9: ");
		int valor = sc.nextInt();
		
		assert valor>9;
		
		int soma = 0;
		
		for (int i=0; i<valor; i++) {
			soma +=i;
			
			assert soma<99: "soma("+soma+")>=99"; //esse texto substitui o AssertionError
			
		}
		
		System.out.println("soma[1.."+valor+"] = "+soma);
		
		sc.close();
	}


	/*para aparecer o asert é preciso ativar com
	 * java -ea NomePrograma
	 * para desativar
	 * java -da NomePrograma
	 */
}
