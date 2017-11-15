
public class Scene {

	private String Navn;
	
	private String Lokation;
	
	private int SceneID;
	
	public Scene(String n, String l, int id) {
		Navn=n;
		Lokation=l;
		SceneID=id;
		
	}

	public String getNavn() {
		return Navn;
	}

	public void setNavn(String navn) {
		Navn = navn;
	}

	public String getLokation() {
		return Lokation;
	}

	public void setLokation(String lokation) {
		Lokation = lokation;
	}

	public int getSceneID() {
		return SceneID;
	}

	public void setSceneID(int sceneID) {
		SceneID = sceneID;
	}
}
