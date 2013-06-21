package Factory;

public class BicycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return (Cycle) new Bicycle();
	}
}
