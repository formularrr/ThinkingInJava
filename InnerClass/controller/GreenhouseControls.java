package InnerClass.controller;

public class GreenhouseControls extends Controller{
	private boolean light = false;
	
	public class LightOn extends Event{
		public LightOn(long delayTime){
			super(delayTime);
		}
		
		public void action(){
			light = true;
		}
		
		public String toString(){
			return "light is on";
		}
	}
	
	public class LightOff extends Event{
		public LightOff(long delayTime){
			super(delayTime);
		}
		
		public void action(){
			light = false;
		}
		
		public String toString(){
			return "light is off";
		}
	}
	
	public class Bell extends Event{
		public Bell(long delayTime){
			super(delayTime);
		}
		
		public void action(){
			addEvent(new Bell(delayTime));
		}
		
		public String toString(){
			return "Bing";
		}
	}
	
	public class Restart extends Event{
		private Event[] eventList;
		
		public Restart(long delayTime, Event[] eventList){
			super(delayTime);
			this.eventList = eventList;
			
			for(Event e : eventList)
				addEvent(e);
		}
		
		public void action(){
			for(Event e : eventList){
				e.start();
				addEvent(e);
			}
			
			start();
			addEvent(this);
		}
		
		public String toString(){
			return "Restart";
		}
		
	}
	
	public static class Terminate extends Event{
		public Terminate(long delayTime){
			super(delayTime);
		}
		
		public void action(){
			System.exit(0);
		}
		
		public String toString(){
			return "Terminating";
		}
	}
	
	
	public static void main(String[] args){
		GreenhouseControls gc = new GreenhouseControls();
		
		gc.addEvent(gc.new Bell(900));
		
		Event[] eventList = {gc.new LightOn(200), gc.new LightOff(400)};
		
		gc.addEvent(gc.new Restart(2000,eventList));
		gc.addEvent(new Terminate(2500));
		
		gc.run();
	}
	
}
