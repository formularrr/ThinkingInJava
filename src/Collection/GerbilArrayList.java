package Collection;

import java.util.ArrayList;


public class GerbilArrayList {

	public static void main(String[] args){
	ArrayList<Gerbil> gerbilList = new ArrayList<Gerbil>();
	
	for(int i=0; i<6; i++)
		gerbilList.add(new Gerbil(i));
	
	for(int i=0; i<gerbilList.size(); i++)
		gerbilList.get(i).hop();
	}
}
