package capitulo3;

public class P0301Hora {
	
	int hora, minuto, segundo;
	
	public void setHorario(int h, int m, int s) {
		hora = h;
		minuto = m;
		segundo = s;
	}
	
	public String toString() {
		return  hora+":"+minuto+":"+segundo;
	}

}
