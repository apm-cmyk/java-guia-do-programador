package outros;

public class GaussJordan {

	public static void main(String[] args) {

		Double [][] matrizA = new Double [3][3];
		Double [][] matrizI = new Double [3][3];
		
		for (int i=0;i<3;i++) {
			for (int j=0; j<3;j++) {
				if (i==j) {
				matrizI[i][j] = 1.0;
				}
				else {
				matrizI[i][j] = 0.0;
				}
				
			}
		}
		
		
		matrizA[0][0]=1.0;
		matrizA[0][1]=1.0;
		matrizA[0][2]=1.0;
		matrizA[1][0]=3.0;
		matrizA[1][1]=5.0;
		matrizA[1][2]=4.0;
		matrizA[2][0]=3.0;
		matrizA[2][1]=6.0;
		matrizA[2][2]=5.0;
		
		
		int i,j,k,n;
		double aux;
		double pivote;
		
		for (i=0;i<matrizA.length;i++) {
			
			pivote = matrizA[i][i];
			for (k=0;k<matrizA.length;k++) {
				matrizA[i][k]=matrizA[i][k]/pivote;
				matrizI[i][k]=matrizI[i][k]/pivote;
			}
			for (j=0;j<matrizA.length;j++) {
				
				if (i!=j){
					aux = matrizA[j][i];
					for (k=0;k<matrizA.length;k++) {
						matrizA[j][k]=matrizA[j][k]-aux*matrizA[i][k];
						matrizI[j][k]=matrizI[j][k]-aux*matrizI[i][k];
					}
				}
				
			}
		}
		
		System.out.println("Matriz A");
		for (i=0;i<3;i++) {
			for (j=0; j<3;j++) {
			
				System.out.print(matrizA[i][j]+"  ");
				
			}
			System.out.println();
			
		}
		System.out.println("Matriz Inversa");
		
		for (i=0;i<3;i++) {
			for (j=0; j<3;j++) {
			
				System.out.print(matrizI[i][j]+"  ");
				
			}
			System.out.println();
			
		}
		

	}
	
		

}
