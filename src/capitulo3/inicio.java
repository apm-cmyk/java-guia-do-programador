package capitulo3;

public class inicio {

	public static void main(String[] args) {
		
		P0301Hora obj1 = new P0301Hora();
		P0302Hora obj2 = new P0302Hora();
		
		
		obj1.setHorario(12, 2, 45);
		System.out.println(obj1.toString());
		
		obj2.setHorario(2, 60, 44);
		System.out.println(obj2.toString());

	}

}
