package Factory;

public class UnicycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return (Cycle) new Unicycle();
	}
}
