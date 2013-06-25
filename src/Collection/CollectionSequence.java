package Collection; 
import java.util.*;
import java.io.*;


public class CollectionSequence implements Collection{
	private Pet[] pets = Pet.createArray(8);
	@Override
	public boolean add(Object arg0) {
		// TODO Auto-generated method stub
		pets = Arrays.copyOf(pets, pets.length+1);
		pets[pets.length-1] = (Pet) arg0;
		return true;
	}

	@Override
	public boolean addAll(Collection arg0) {
		// TODO Auto-generated method stub
		int len = pets.length;
		pets = Arrays.copyOf(pets, pets.length + arg0.size());
		
		Iterator it = arg0.iterator();
	
		while(it.hasNext()){
			pets[len++] = (Pet)it.next(); 
		}
		return true;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		pets[0] = null;
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		for(Pet p : pets)
			if(p.equals(arg0))
				return true;
		return false;
	}

	@Override
	public boolean containsAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return pets.length == 0;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new Iterator(){
			private int index = 0 ;
			
			public boolean hasNext(){
				return index < pets.length;
			}
			
			public Pet next(){
				return pets[index++];
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				
			}
		};
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		if(contains(arg0)){
			int pos = 0;
			for( ; pos < pets.length ; pos++)
				if(pets[pos].equals(arg0))
					break;
			while(pos < pets.length-1){
				pets[pos] = pets[pos+1];
				pos++;
			}
			pets[pets.length-1] = null;
			return true;
		}
		return false;
	}

	@Override
	public boolean removeAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return pets.length;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return pets;
	}

	@Override
	public Object[] toArray(Object[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args){
		CollectionSequence c = new CollectionSequence();
		Iterator it = c.iterator();
		
		Set<Pet> pets = new HashSet<Pet>();
		pets.add(new Pet("aaa"));
		pets.add(new Pet("bbb"));
		c.addAll(pets);
		Pet p = new Pet("new");
		c.add(p);
		//c.clear();
		System.out.println(c.contains(p));
		Pet n = new Pet("new");
		System.out.println(c.contains(n));
		System.out.println(c.remove(p));
		
		
		it = c.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		
	}
	
}