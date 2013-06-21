package Agent;

public class SpaceShip {
	private SpaceShipAgent agent= new SpaceShipAgent();
	
	public void up(int velocity){
		agent.up(velocity);
	}
	
	public static void main(String[] args){
		SpaceShip ss = new SpaceShip();
		ss.up(99);
	}
}
