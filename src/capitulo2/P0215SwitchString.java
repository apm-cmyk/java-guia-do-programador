package capitulo2;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class P0215SwitchString {

	public static void main(String[] args) {
		
		if (args.length >0) {
			
			//primeiro elemento de args em minuscula
			switch(args[0].toLowerCase()) {
			case "data":
				System.out.println(DateFormat.getDateInstance().format(new Date()));
			break;
			
			case "hora":
				System.out.println(DateFormat.getTimeInstance().format(new Date()));
			break;
			
			case "nova-data":
				System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			break;
			
			case "nova-hora":
				System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
			break;
			
			default:
				System.out.println("comando nao conhecido");
			
			}	
			
		}else {
			System.out.println("nao foi oferecido argumento");
			
		}
		

	}

}
