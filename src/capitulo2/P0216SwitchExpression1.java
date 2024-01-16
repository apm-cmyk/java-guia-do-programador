package capitulo2;

public class P0216SwitchExpression1 {

	public static void main(String[] args) {
		
		/* no java 12 o switch passou a ser usado como expressao (preview feature)
		 * produzindo um valor de retorno
		 * no java 13 ocorreu melhorias e no 14 incorporado definitivamete
		 */
		
		//vamos aos exemplos
		
		//1) Java 12
		int mes =1;
		@SuppressWarnings("unused")
		int ndias;
		
		switch(mes) {
		
		case 1: case 3:case 5: case 7:
		case 8: case 10: case 12:
			ndias = 31;
			break;
			
		case 4: case 6: case 9: case 11:
			ndias = 30;
			break;
		
		default:
			ndias = 28;
		}
		
		//2) Java 13
		
		switch(mes) {
		
		case 1,3,5,7,8,10,12:
			ndias = 31;
			break;
		case 4,6,9,11:
			ndias = 30;
			break;
		default:
			ndias = 28;
		}
		
		//3) Java 14
		
		ndias = switch(mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> 31;
		case 4, 6, 9, 11 -> 30;
		default -> 28;
		};
		
	}

}
