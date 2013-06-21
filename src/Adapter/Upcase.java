package Adapter;


class Upcase extends StringProcessor{

	@Override
	public String process(Object input) {

		return ((String)input).toUpperCase();
	}
	
}
