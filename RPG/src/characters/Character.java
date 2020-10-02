package characters;
import entities.*;

public class Character implements CharacterFunctionalities {

	private String name;
	private int hitPoints;
	private HeroClass heroClass;
	private Weapon weapon;
	
	public Character(String name, int hitPoints, HeroClass heroClass, Weapon weapon) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.heroClass = heroClass;
		this.weapon = weapon;
	}	
	
	@Override
	public void damageCharacter(int amount) {
		// TODO Auto-generated method stub
	}

	@Override
	public void healCharacter(int amount) {
		// TODO Auto-generated method stub
	}

	@Override
	public void talkToCharacter() {
		// TODO Auto-generated method stub
	}

	public String getName() {
		return this.name;
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

	public String getHeroClass() {
		return heroClass.toString();
	}

	public void setHeroClass(HeroClass heroClass) {
		this.heroClass = heroClass;
	}

	public String getWeapon() {
		return weapon.toString();
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
}
