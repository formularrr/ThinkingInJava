package Adapter;

public class FilterAdapter implements Processor{
	Filter filter;
	
	public FilterAdapter(Filter filter){
		this.filter = filter;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return filter.name();
	}

	@Override
	public Object process(Object input) {
		// TODO Auto-generated method stub
		return filter.process((Waveform)input);
	}
	
	public static void main(String[] args){
		Waveform w = new Waveform();
		
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
	}

}
