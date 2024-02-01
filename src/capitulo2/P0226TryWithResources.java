package capitulo2;

import java.io.IOException;
import java.io.StringReader;

public class P0226TryWithResources {
	
	/* na versão java 9 o ARM foi simplificado
	 * para melhorar a legibilidade (o recurso moniorado
	 * é declarado antes)
	 */
	public static void main(String[] args) {
	String s1 = "Java - Guia do  Programador";
	processoRecurso(s1);
	}

	public static void processoRecurso(String s2) {
		StringReader recurso = new StringReader(s2);
		
		//monitora os recursos
		try(recurso){
			int espaco = 0,c;
			
			while ((c = recurso.read()) !=-1) {
			
				if (c == 32) espaco++;	
			}
			System.out.println("Espacos: "+espaco);
		}catch(IOException e1) {
			System.out.println(e1);
		}
		
	}
}
