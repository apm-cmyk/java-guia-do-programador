package capitulo3;

public class inicio {

	public static void main(String[] args) {
		
		P0301Hora obj1 = new P0301Hora();
		P0302Hora obj2 = new P0302Hora();
		P0304Ponto2D obj3 = new P0304Ponto2D();
		P0304Ponto2D obj4 = new P0304Ponto2D(5,10);
		
		
		obj1.setHorario(12, 2, 45);
		System.out.println(obj1.toString());
		
		obj2.setHorario(2, 60, 44);
		System.out.println(obj2.toString());
		
		obj3.distancia(20, 30);
		System.out.println(obj3.distancia(20, 30));
		System.out.println(obj3.toString());
		
		obj3.distancia(new P0304Ponto2D(4,6));
		System.out.println(obj3.distancia(new P0304Ponto2D(4,6)));
		System.out.println(obj3.toString());

		obj4.distancia(20, 30);
		System.out.println(obj4.distancia(20, 30));
		System.out.println(obj4.toString());
		
		obj4.distancia(new P0304Ponto2D(4,6));
		System.out.println(obj4.distancia(new P0304Ponto2D(4,6)));
		System.out.println(obj4.toString());

		P0305Dobro static1 = new P0305Dobro();
		//acessando variaveis static
		int num1 = P0305Dobro.getInstancia();
		System.out.println(num1);
		P0305Dobro static2 = new P0305Dobro();
		int num2 = P0305Dobro.getInstancia();
		System.out.println(num2);
	}

}
