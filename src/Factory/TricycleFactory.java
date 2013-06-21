package Factory;

public class TricycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return (Cycle) new Tricycle();
	}
}
