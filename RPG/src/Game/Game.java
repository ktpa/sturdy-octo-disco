package Game;
import java.util.ArrayList;

import characters.Character;
import entities.*;

public class Game {
	
	ArrayList<Character> characters = new ArrayList<Character>();
	
	public Game() {
		// TODO 
		// (SET RESOLUTION AND STUFF FOR SCREEN)
	}
	
	public final String EOL() {
		return("\n");
	}
	
	public void initGame() {
		
		
//		Character character = new Character(new Hero("Karl", 3));
		testCharacterFill();
		System.out.println("Lul returned");
		// TODO
		// Functionality for creating a character
		// Functionality for inventory
		// Functionality for economics
		for (int i = 0; i < this.characters.size(); i++) {
			System.out.println("Name: " + this.characters.get(i).getName() + "." + EOL() + "Type: " + this.characters.get(i).getHeroClass() + "." + EOL() + "Hit points: " + this.characters.get(i).getHitPoints() + "." + EOL() + "Weapon: " + this.characters.get(i).getWeapon() + "." + EOL());
		}
		
	}

	
	private void testCharacterFill() {
		String[] names = {"Karl", "Jens", "Henke", "Nils", "Richard", "Boye", "Leffe", "Mega", "Irina", "Porkala"};
		int[] validHitPoints = {2, 4, 7, 9, 13, 16, 18, 21};
		int heroes = (int) (Math.random() * 10);
		int enemies = (int) (Math.random() * 10);
		for (int i = 0; i < heroes; i++) {
			characters.add(new Hero(names[(int) (Math.random() * names.length)], 
					validHitPoints[(int) (Math.random() * validHitPoints.length)],
					new HeroClass("Hero"),
					new Weapon("Fists", 3, false)));
		}
		for (int i = 0; i < enemies; i++) {
			characters.add(new Enemy(names[(int) (Math.random() * names.length)], 
					validHitPoints[(int) (Math.random() * validHitPoints.length)],
					new HeroClass("Enemy"),
					new Weapon("Fists", 3, false)));
		}
		
		System.out.println("Done creating characters, returning...");
	}
	
}
