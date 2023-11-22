package capitulo2;

public class P0213If {

	public static void main(String[] args) {
		
		if (args.length >0) {
			//converte 1º argumento para o inteiro
		
		int max = Integer.parseInt(args[0]);
		for (int j=0; j<max; j++) {
			System.out.println(j + " ");
		}
			System.out.println("\nFim da Contagem");
		}
		System.out.println("Fim do Programa");
		
	}

}
