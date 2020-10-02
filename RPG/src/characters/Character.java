package characters;
import entities.*;

public class Character implements CharacterFunctionalities {

	Hero hero = null;
	Npc npc = null;
	Enemy enemy = null;
	Weapon weapon = null;
	HeroClass heroClass = null;
	String type;
	
	public Character() {
		
	}
	
	public Character(Hero hero) {
		this.type = "hero";
		this.hero = hero;
		
	}
	
	public Character(Enemy enemy) {
		this.enemy = enemy;
		this.type = "enemy";
	}
	
	public Character(Npc npc) {
		this.npc = npc;
		this.type = "npc";
	}
	
	public Character getCharacter() {
		if(this.hero != null) {
			return((Character) this.hero);
		} else if (this.enemy != null) {
			return((Character) this.enemy);
		} else {
			return((Character) this.npc);
		}
		
	}
	
	public int getHitPoints() {
		if(this.type.equals("hero")) {
			return(this.hero.getHitPoints());
		} else if (this.type.equals("enemy")) {
			return(this.enemy.getHitPoints());
		} else {
			return(this.npc.getHitPoints());
		}
	}
	
	public String getType() {
		return this.type;
	}
	
	public Hero getHero() {
		return this.hero;
	}
	
	public Enemy getEnemy() {
		return this.enemy;
	}
	
	public Npc getNpc() {
		return this.npc;
	}
	
	public String getName() {
		if(this.hero != null) {
			return(this.hero.getName());
		} else if (this.enemy != null) {
			return(this.enemy.getName());
		} else {
			return(this.npc.getName());
		}
	}
	
	

	@Override
	public void damageCharacter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void healCharacter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void talkToCharacter() {
		// TODO Auto-generated method stub
		
	}
	
}