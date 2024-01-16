package capitulo2;

public class P0218Continue {

	public static void main(String[] args) {
		
		int soma = 0; 
		for (int i=0; i<100; i++) {
			
			//abrevia a iteração se multiplo de 2, 3 e 5
			if (i%2 == 0 || i%3 == 0 || i%5 == 0) {
				System.out.println("i = "+i+" multiplo de 2, 3 ou 5");
				//o continue faz voltar para o for
				continue;
			}
			//se if for negativo vem para a soma
			//processamento normal para os outros casos
			soma = soma +i;
			System.out.println("i = "+i+" soma = "+soma);
		}
	}

}
