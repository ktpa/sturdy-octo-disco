package entities;

import characters.Character;

public class Enemy extends Character {

	private String name;
	private int hitPoints;
	private HeroClass heroClass;
	
	public Enemy(String name, int hitPoints) { 
		this.name = name;
		this.hitPoints = hitPoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public HeroClass getHeroClass() {
		return heroClass;
	}

	public void setHeroClass(HeroClass heroClass) {
		this.heroClass = heroClass;
	}
	
}
