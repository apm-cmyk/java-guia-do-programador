package capitulo3;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		
		char[] letras = new char[26];
		int[] numeros = new int[26];
		
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		numeros[5] = 6;
		numeros[6] = 7;
		numeros[7] = 8;
		numeros[8] = 9;
		numeros[9] = 1;
		numeros[10] = 2;
		numeros[11] = 3;
		numeros[12] = 4;
		numeros[13] = 5;
		numeros[14] = 6;
		numeros[15] = 7;
		numeros[16] = 8;
		numeros[17] = 9;
		numeros[18] = 1;
		numeros[19] = 2;
		numeros[20] = 3;
		numeros[21] = 4;
		numeros[22] = 5;
		numeros[23] = 6;
		numeros[24] = 7;
		numeros[25] = 8;
		
		
		
		letras[0]='A';
		letras[1]='B';
		letras[2]='C';
		letras[3]='D';
		letras[4]='E';
		letras[5]='F';
		letras[6]='G';
		letras[7]='H';
		letras[8]='I';
		letras[9]='J';
		letras[11]='K';
		letras[11]='L';
		letras[12]='M';
		letras[13]='N';
		letras[14]='O';
		letras[15]='P';
		letras[16]='Q';
		letras[17]='R';
		letras[18]='S';
		letras[19]='T';
		letras[20]='U';
		letras[21]='V';
		letras[22]='W';
		letras[23]='X';
		letras[24]='Y';
		letras[25]='Z';

		Scanner sc= new Scanner(System.in);
		String nome;
		int num=0;
		System.out.print("Nome:");
		nome = sc.next();
		for(int i=0; i<nome.length(); i++) {
		
			
			for(int j=0;j<letras.length;j++) {
				
				if(nome.toUpperCase().charAt(i) == letras[j]) {
					num = num +numeros[j];
					System.out.println("O numero do nome eh:"+num);
				}
			}		
		}
		
		System.out.println("O numero do nome eh:"+num);
		sc.close();
	}

}
