package capitulo3;

public class P0306UsaDobro {

	/*uma dica sobre quando usar static
	 * o metodo é estatico quando o serviço
	 * provido não depende de valores internos do objeto
	 * mas apenas dos parâmetros internos recebidos
	 * 
	 */
	
	//a declaração deve ser feito na classe e não no método
	public static final int MAX = 10;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		//uso do metodo sem instancia
		System.out.println("Instancia = "+P0305Dobro.getInstancia());
		int x = 7;
		System.out.println("Instanciando objeto Dobro... ");
		P0305Dobro obj = new P0305Dobro();
		System.out.println("Instancia do obj = "+obj.getInstancia());
		System.out.println("O dobro do obj = "+obj.dobro(x));
		System.out.println("Ultimo valor usado = "+obj.ultimoValor);

		
		
		//só dessa forma se pode declarar uma constante dentro do método
		final  int MIN = 1;
		
	}
	
}
