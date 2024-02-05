package capitulo2;

public class P0232MatrizTriangular {

	public static void main(String[] args) {
	
		/*
		 * Uma matriz irregular em Java é uma matriz na qual as linhas 
		 * podem ter comprimentos diferentes. Diferentemente de uma matriz 
		 * regular, onde cada linha tem o mesmo número de elementos, 
		 * em uma matriz irregular, cada linha pode ter um número diferente 
		 * de elementos. Isso é possível porque uma matriz irregular é, 
		 * na verdade, um array de arrays, onde cada "subarray" pode ter 
		 * um tamanho diferente.
		 */
		
		
		
		double[][] m;
		m = new double[4][]; //veja não são 4 linhas mas 4 arrays e cada array terá uma dimensão diferente
		int aux = 0; 
		
		for (int linha=0; linha<m.length; linha++) {
			m[linha]= new double[linha+1]; //aqui estou dizendo quantos elementos (ou coluna) terá o array.
			for (int coluna=0; coluna<m[linha].length;coluna++) {
				m[linha][coluna] = aux++;
			}
		}
		
		
		for(int linha = 0; linha<m.length; linha++) {
			for(int coluna=0; coluna<m[linha].length; coluna++) {
				
				System.out.println(m[linha][coluna]+"\t");
				
			}
			System.out.println();
		}
		
		//pesquisar sobre matri irregulares

	}

}
