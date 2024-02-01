package capitulo2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class P0225TryWithResources {

	public static void main(String[] args) {
		
		/*
		 * O finally é usado para poder finaizar alocação de recursos
		 * No Java 7 introduziu o ARM o conceito try-com-recurso
		 * Ele abrange todos os obj que implementam as interfaces
		 * java.lang.AutoCloseable e java.io.Closeable 
		 * Com o ARM  finally fica implicito
		
		*/
		
		try(InputStream recurso = new FileInputStream(args[0]);) {
			
			System.out.println("Arquivo "+ args[0]+" aberto.");
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("Arquivo "+ args[0]+" fechado.");

	}

}
