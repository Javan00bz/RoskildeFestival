
public class Tidspunkt {

	private int Dato;
	
	private int Måned;
	
	private int Årstal;
	
	private int Klokkeslet;
	
	public Tidspunkt(int d, int m, int y, int k) {
		Dato=d;
		Måned=m;
		Årstal=y;
		Klokkeslet=k;
		
	}

	public int getDato() {
		return Dato;
	}

	public void setDato(int dato) {
		Dato = dato;
	}

	public int getMåned() {
		return Måned;
	}

	public void setMåned(int måned) {
		Måned = måned;
	}

	public int getÅrstal() {
		return Årstal;
	}

	public void setÅrstal(int årstal) {
		Årstal = årstal;
	}

	public int getKlokkeslet() {
		return Klokkeslet;
	}

	public void setKlokkeslet(int klokkeslet) {
		Klokkeslet = klokkeslet;
	}
}
