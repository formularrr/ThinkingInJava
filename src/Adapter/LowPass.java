package Adapter;

public class LowPass extends Filter{
	double cutoff;
	
	public LowPass(double cutoff){
		this.cutoff = cutoff;
	}
	
	public Waveform process(Object input){
		return (Waveform) input;
		
	}
}
