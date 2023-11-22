package outros;

public class Complexo {
	
	private double real;
	private double imag;
	

	public Complexo(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImag() {
		return imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}

	public Complexo soma(Complexo num) {
		
		return new Complexo(num.real+real,num.imag+imag);
		
	}
	
	public Complexo sub(Complexo num) {
		
		return new Complexo(real-num.real,imag-num.imag);
		
	}
	
	public Complexo div(Complexo num) {
		return new Complexo((num.real*real+num.imag*imag)/(num.real*num.real+num.imag*num.imag),(num.real*imag-real*num.imag)/(num.real*num.real+num.imag*num.imag));
		
	}
	public Complexo mult(Complexo num) {
		
		return new Complexo(num.real*real-num.imag*imag,real*num.imag+imag*num.real);
		
	}
	
	public String toString() {
		
		if (imag>0) {
		return real+" + "+imag+"i";
		}else
		return real+" "+imag+"i";
	}
	
	public static String toString(Complexo[][] matriz) {
		
		String aux;
		aux = "";
		
		for (int i=0;i<matriz.length;i++) {

			aux = aux+"|";
			for(int j = 0; j<matriz[0].length;j++) {
				aux = aux +matriz[i][j]+" ";
			}
			aux = aux +"|";
			aux = aux + "\n";
		}
		
		return aux;
	}
	
	
		
}
