/*


public class operacaoMatriz {
    //Calcula A * B. A e B precisam ser matrizes válidas.
    //A.columns = B.rows
    public static double[][] mult(double[][] A, double[][] B){        
        int n = A[0].length; //A.columns = B.rows
        //Verfica se A.columns = B.rows
        if(n != B.length){
            throw new IllegalArgumentException("A.columns != B.rows");
        }
        int rows = A.length; //A.rows
        int cols = B[0].length; //B.columns
        double[][] C = new double[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                for(int k = 0; k < n; k++){
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }        
        return C;
    }
    //Método auxilar para converter uma matriz para String
    private static String toString(double[][] matrix){
        String aux = "";
        for(int i = 0; i < matrix.length; i++){
            aux += "[" + matrix[i][0];
            for(int j = 1; j < matrix[i].length; j++){
                aux += "," + matrix[i][j];
            }
            aux += "]";
            if(i != matrix.length - 1){
                aux += "\n";
            }
        }
        return aux;
    }
    //Testes
    public static void main(String[] args){
        //Exemplo 1        
        double[][] A = {{3, 1},
                        {2, -1},
                        {0, 4}};
        double[][] B = {{1, -1, 2},
                        {3, 0, 5}};
        System.out.println("A = \n" + toString(A));
        System.out.println("B = \n" + toString(B));
        System.out.println("A * B = \n" + toString(mult(A, B)));
        
        System.out.println();//break the line
        
        //Exemplo 2
        A = new double[][]{{1, 2},
                           {0, 5}};
        B = new double[][]{{-1},
                           {1}};
        System.out.println("A = \n" + toString(A));
        System.out.println("B = \n" + toString(B));
        System.out.println("A * B = \n" + toString(mult(A, B)));
    }
}*/