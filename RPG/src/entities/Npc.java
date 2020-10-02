package entities;
import characters.Character;

public class Npc extends Character {
	
	private String[] greetings;
	private String[] goodbyes;
	private String type;
	
	public Npc(String[] greetings, String[] goodbyes, String type) {
		this.greetings = greetings;
		this.goodbyes = goodbyes;
		this.type = type;
	}
	
	public String getGreeting() {
		return(greetings[(int) (Math.random() * this.greetings.length)]);
	}
	
	public String getGoodbyes() {
		return(goodbyes[(int) (Math.random() * this.goodbyes.length)]);
	}
	
	public String getType() {
		return(this.type);
	}
	
}
