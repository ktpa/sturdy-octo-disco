package entities;
import characters.Character;

public class Npc extends Character {
	
	public Npc(String name, int hitPoints, HeroClass heroClass, Weapon weapon) {
		super(name, hitPoints, heroClass, weapon);
	}
	
	@Override
	public String getName() {
		return(super.getName());
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public int getHitPoints() {
		return (super.getHitPoints());
	}

	@Override
	public void setHitPoints(int hitPoints) {
		super.setHitPoints(hitPoints);
	}
	
	@Override
	public String getHeroClass() {
		return (super.getHeroClass());
	}
	
	@Override
	public String getWeapon() {
		return (super.getWeapon());
	}
	
	@Override
	public void setWeapon(Weapon weapon) {
		super.setWeapon(weapon);
	}
	
}
