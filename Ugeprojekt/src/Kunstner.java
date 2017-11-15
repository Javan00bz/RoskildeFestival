
public class Kunstner {

	private String Navn;

	private String Nationalitet;

	private int KunstnerID;

	public Kunstner(String n, String nat, int ID) {
		Navn=n;
		Nationalitet=nat;
		KunstnerID=ID;
		
	}

	public String getNavn() {
		return Navn;
	}

	public void setNavn(String navn) {
		Navn = navn;
	}

	public String getNationalitet() {
		return Nationalitet;
	}

	public void setNationalitet(String nationalitet) {
		Nationalitet = nationalitet;
	}

	public int getKunstnerID() {
		return KunstnerID;
	}

	public void setKunstnerID(int kunstnerID) {
		KunstnerID = kunstnerID;
	}
}
