package entities;

import characters.Character;

public class Hero extends Character {
	
	private String name;
	private int hitPoints;
	private HeroClass heroClass;
	private Weapon weapon;
	
	public Hero(String name, int hitPoints) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.heroClass = null;
		this.weapon = new Weapon("Fists", 3, false);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitPoints() {
		return this.hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	
	public HeroClass getHeroClass() {
		return this.heroClass;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	
	
}