package capitulo3;

public class P0308CriaRet1 {

	public static void main(String[] args) {
		
		
		double largura = Double.parseDouble(args[0]);
		double altura = Double.parseDouble(args[1]);
		
		P0307Retangulo ret1 = new P0307Retangulo(largura, altura);

		System.out.println("Retangulo["+ ret1.getLargura()+"x"
				+ ret1.getAltura()+ "]"
				);
		
	}

}
