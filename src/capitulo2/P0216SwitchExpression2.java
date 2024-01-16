package capitulo2;

import java.util.Calendar;
import java.util.Scanner;

public class P0216SwitchExpression2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero do mes 1-12");
		int mes = sc.nextInt();
		
		//switch como expressao
		
		int ndias = switch(mes) {
		case 1,3,5,7,8,10,12 -> 31;
		case 4,6,9,11 ->30;
		default ->28+ (Calendar.getInstance().get(Calendar.YEAR)%4==0? 1:0);
		
		};
		
	}

}
