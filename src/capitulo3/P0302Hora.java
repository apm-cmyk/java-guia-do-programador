package capitulo3;

public class P0302Hora {

	private int hora, minuto, segundo;
	
	
	public int getHora() {return hora;}
	public int getMinuto() {return minuto;}
	public int getSegundo() {return segundo;}
	
	
	public void setHora(int h) {
		if(h>=0 && h<24) hora =h;
	}
	
	public void setMinuto(int m) {
		if(m>=0 && m<60) minuto =m;
	}
	
	public void setSegundo(int s) {
		if(s>=0 && s<60) segundo=s;
	}
	
	public void setHorario (int h, int m, int s) {
		setHora(h); setMinuto(m); setSegundo(s);
	}
	
	public String toString() {
		return String.format("%2d:%2d:%2d", getHora(), getMinuto(), getSegundo());
	}
	
}
