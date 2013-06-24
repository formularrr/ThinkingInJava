package InnerClass;

import java.util.Random;

interface Game{
	void play();
}

interface GameFatory{
	Game getGame();
}

class Coin implements Game{
	private Random r = new Random();
	
	private String[] s = {"正面", "反面"};
	
	public void play(){
		int i = r.nextInt(2);
		
		System.out.println(s[i]);
	}
	
	public static GameFatory factory = new GameFatory(){
		public Game getGame(){
			return new Coin();
		}
	};
}

class Six implements Game{
	private Random r = new Random();
	private String[] s ={"1", "2", "3", "4", "5", "6"};
	
	public void play(){
		int i = r.nextInt(6);
		
		System.out.println(s[i]);
	}
	
	public static GameFatory factory = new GameFatory(){
		public Game getGame(){
			return new Six();
		}
	};
	
}

public class Games{
	public static void playGames(GameFatory factory){
		Game game = factory.getGame();
		game.play();
	}
	
	public static void main(String[] args){
		for(int i=0; i<100; i++){
			Games.playGames(Coin.factory);
			Games.playGames(Six.factory);
		}
	}
}