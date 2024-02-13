package capitulo3;

import java.util.Scanner;

public class P0303UsaHora {

	public static void main(String[] args) {
		
		P0302Hora obj1 = new P0302Hora();
		
		obj1.setHorario(10, 5, 15);
		System.out.println("Hora: "+obj1.toString());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hora? "); int h = sc.nextInt();
		System.out.println("Minuto? "); int m = sc.nextInt();
		System.out.println("Segundo? "); int s = sc.nextInt();
		sc.close();
		
		obj1.setHorario(h, m, s);
		System.out.println("Hora: "+obj1.toString());
		
		if(obj1.getHora()>=18 || obj1.getHora()<6){
			System.out.println("Eh noite!");
		}else {System.out.println("Eh dia!");}
		
		
	}

}
