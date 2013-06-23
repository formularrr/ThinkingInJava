package Agent;

public class SpaceShipAgent {
	private SpaceShipControls con = new SpaceShipControls();

	public void up(int velocity){
		con.up(velocity);
	}
}
