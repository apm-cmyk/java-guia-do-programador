package capitulo2;

public class P0223TryCatchFinally {

	public static void main(String[] args) {
		
		int j = 5;
		
		try {
			j = Integer.parseInt(args[0]);
		}catch(Exception e) {
			System.out.println("argumento invalido ou ausente");
		}finally{
			while(j>=0) {
				System.out.println(j);
				j--;
			}
		}
		
		
	}

}
