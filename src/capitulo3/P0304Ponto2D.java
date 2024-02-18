package capitulo3;

public class P0304Ponto2D {
	
	
	public double x, y;
	
	
	//contrutor default
	public P0304Ponto2D() {
		x = 0; y = 0;	
	}
	
	//contrutor parametrizado
	public P0304Ponto2D(double px, double py) {	
		x = px; y = py;
	}
	
	//metodo calcular a distancia
	public double distancia (double px, double py) {		
		return Math.sqrt(Math.pow(x- px, 2)+Math.pow(y-py, 2));
	}
	
	//diaancia entre a instancia e um ponto
	public double distancia(P0304Ponto2D p) {
		return Math.sqrt(Math.pow(x- p.x, 2)+Math.pow(y-p.y, 2));	
	}
	
	//toString
	public String toString() {
		return "P0304Ponto2D  [x="+x+" ,y="+y+"]";
	}
	

}
