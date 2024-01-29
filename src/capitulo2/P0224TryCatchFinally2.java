package capitulo2;

import java.io.IOException;
import java.io.InputStream;

public class P0224TryCatchFinally2 {

	public static void main(String[] args) {

		InputStream recurso = null;

		try {
		
		System.out.println("Arquivo "+args[0]+" aberto.");
		
		}catch(IOException e1){
			
		System.out.println(e1);
		}
		finally {
		
		if (recurso != null) try{
			recurso.close();
			System.out.println("Arquivo "+args[0]+" fechado.");
		
		}catch (IOException e2) {
			
		}
	}	
}

