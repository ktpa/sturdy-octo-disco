package entities;

public class Weapon {
	String type;
	int damage;
	boolean disarmable;
	
	public Weapon(String type, int damage, boolean disarmable) {
		this.type = type;
		this.damage = damage;
		this.disarmable = disarmable;
	}
	
	public String toString() {
		return this.type;
	}
}
