package Factory;

public class TestFactory {
	public static void makeCycle(CycleFactory cycleFactory){
		
		cycleFactory.getCycle().draw();
		
	}
	public static void main(String[] args){
		makeCycle(new BicycleFactory());
		makeCycle(new UnicycleFactory());
		makeCycle(new TricycleFactory());
	}

}
