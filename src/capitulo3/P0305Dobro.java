package capitulo3;

					/*Membros Estáticos*/
/* Membros estáticos são variaveis de instancia, variaveis e métodos
*  que queremos que compatilhe informações com todos os outros 
*  objetos da Classe
*  Exemplo: (uma constante, contagem, totalização e etc)
*  Variaiveis de classe (estática) são armazendadas
*  na classe e sus informaçoes são comportilhadas por todos
*  os outros objetos da classe
*  Variaveis de instancia são armazenda em seu próprio objeto 
*  e não são compartilhadas com os outros objeto
*  Importante: membros estáticos podem ser utilizados sem precisar 
*  de instanciação. Exemplo int num = Dobro.getInstancia()
*  Dobro é o nome da classe
*  Não se acessa membro está por uma variavel de instancia 
*  se vc fizer isso terá que usar @SuppressWarnings("static-access")*/

public class P0305Dobro {
	
	//armazena numero de instancia de classe
	
	private static int instancia = 0;
	
	
	public int ultimoValor;
	
	
	//sempre que criar um objeto a instancia cresce uma unidade
	
	public P0305Dobro() {instancia++;}
	
	public static int getInstancia() {return instancia;}
	
	public int dobro(int valor) {ultimoValor = valor; return 2*valor;}
	

}
