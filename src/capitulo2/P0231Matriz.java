package capitulo2;

public class P0231Matriz {

	public static void main(String[] args) {
		
		/*<tipo>[][] identificador = new <tipo> [dim][dim2][dim3]...[dimn]
		 * <tipo> identificador[][] = new <tipo> [dim][dim2][dim3]...[dimn]
		 */
		double[][] m = new double[3][4];

		//m.length = numero de linhas da matriz
		//m[0].length = numero de colunas (elementos) na linha 0
		//m é um array m.length é o numero de elementos no array ou numero coluna
		
		for(int linha = 0; linha<m.length; linha++) {
			for(int coluna=0; coluna<m[linha].length; coluna++) {
				
				m[linha][coluna] = linha*m[linha].length+coluna;
				
			}
		}
		
		for(int linha = 0; linha<m.length; linha++) {
			for(int coluna=0; coluna<m[linha].length; coluna++) {
				
				System.out.println(m[linha][coluna]+"\t");
				
			}
			System.out.println();
		}
		
	
		
	}

}
