package capitulo3;

public class P0307Retangulo {
	
	private double largura, altura;
	
	public P0307Retangulo() {
		this (1,2);
	}

	public P0307Retangulo(double i, double j) {
		this.setTamanho(largura,altura);		
	}
	
	public void setTamanho(double largura, double altura) {
		
		if(largura>=0 && altura>=0) {
			this.largura = largura; this.altura = altura;
		}	
	}
	
	public double getLargura() {
		return largura;
	}
	
	public double getAltura() {
		return altura;
	}
	

}
