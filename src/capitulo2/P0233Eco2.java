package capitulo2;

public class P0233Eco2 {

	public static void main(String[] args) {
		
		for (int i=0; i<args.length; i++) {
			System.out.printf("Argumento #%d: %s ", i, args[i]);
			
			try {
				int n = Integer.parseInt(args[i]);
				System.out.printf("(inteiro = %d)%n", n);
			}catch(NumberFormatException e1){
				//se ocorrer exceçao não é inteiro
				
				try {
					double d = Double.parseDouble(args[i]); 
					System.out.printf("(real = %f)%n", d);

				}catch(NumberFormatException e2) {
					System.out.printf("(String =\"%s\")%n", args[i]);
				}
			}
			
			
		}
		
		
	}

}
