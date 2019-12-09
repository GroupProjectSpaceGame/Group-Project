package GameBackend.Subsystems;

import java.util.ArrayList;

import GameBackend.Vessels.Vessel;

public class Weapon extends Subsystem {

	int damage = 0;
	
	public Weapon(Vessel owner, int damage) {
		super(owner);
		damage = this.damage;
		// TODO Auto-generated constructor stub
	}

	public int getDamage() {
		return damage;
	}
	
	public void attack(ArrayList<Vessel> weaponTargets) {
		for (Vessel instTarget : weaponTargets) {
			for (Shield instShield : instTarget.getShields()) {
				instShield.addShieldValue(damage);
			}
		}
	}
	
}
