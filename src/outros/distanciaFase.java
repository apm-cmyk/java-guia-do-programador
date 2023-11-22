package outros;



public class distanciaFase {

	private Double x;
	private Double y;
	
	public distanciaFase(Double x, Double y) {
		this.x = x;
		this.y = y;
	}
	
	public Double distPonto(Double x1, Double y1) {
		
		return Math.sqrt(Math.pow(x-x1, 2)+Math.pow(y-y1, 2));
	}
	
	
	public void distanciFase() {
		
	}
	
	
	public static void main(String[] args) {
		
		//Distancia Fases (o mesmo replica para para-raio
		
		Double[] faseX = {200.0,300.0,100.0};
		Double[] faseY = {100.0,200.0,200.0};
		int numFase = faseX.length;
		int n = 0;
		for (int i = 1; i<numFase;i++) {
			
			n += (numFase-i);
		}
		
		
		
		Double[] distanciaFase = new Double[n];
	
		int x=0;
	
		for(int i=0;i<faseX.length; i++) {
			int j=i+1;
		distanciaFase p = new distanciaFase(faseX[i],faseY[i]);
		while(j <=faseX.length-1) {
					distanciaFase[x] = p.distPonto(faseX[i+1], faseY[i+1]);
				x++;
				j++;
		}

	}
	
	int	b = 27;
		
System.out.println(Math.cbrt(b));
System.out.println(Math.pow(b,1.0/3.0));
		

	}

}
