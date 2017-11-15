
public class Koncert {

	private Kunstner kunstner;

	private Scene scene;

	private Tidspunkt tidspunkt;

	public Koncert(Kunstner kunstner, Scene scene, Tidspunkt tidspunkt) {

		this.kunstner=kunstner;
		this.scene=scene;
		this.tidspunkt=tidspunkt;


	}

	public Kunstner getKunstner() {
		return kunstner;
	}

	public Scene getScene() {
		return scene;
	}

	public Tidspunkt getTidspunkt() {
		return tidspunkt;
	}



}
