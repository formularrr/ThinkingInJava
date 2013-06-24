package InnerClass.controller;

import java.awt.List;
import java.util.ArrayList;

public class Controller{
	private ArrayList<Event> eventList = new ArrayList<Event>();
	
	public void addEvent(Event e){
		eventList.add(e);
	}
	
	public void run(){
		while(eventList.size() > 0 ){
			for(Event e : new ArrayList<Event>(eventList)){
				if(e.ready()){
					System.out.println(e);
					e.action();
					eventList.remove(e);
				}
			}
		}
	}
}