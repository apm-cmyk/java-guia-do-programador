package capitulo2;

public class P0214Switch {

	public static void main(String[] args) {
		
		if (args.length>0) {
			switch(args[0].charAt(0)) {
			
			case 'a':
			case 'A': System.out.println("Vogal A");
			break;
			
			case 'b':
			case 'B': System.out.println("Vogal B");
			break;
			
			case 'c':
			case 'C': System.out.println("Vogal C");
			break;
			
			case 'd':
			case 'D': System.out.println("Vogal D");
			break;
			
			default:System.out.println("letra inicial não eh vogal");
				
			
			}
			
		}else {
			System.out.println("não foi fornecido argumento");
		}
		

	}

}
