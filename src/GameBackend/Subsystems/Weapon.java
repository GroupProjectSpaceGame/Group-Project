package GameBackend.Subsystems;

import java.util.ArrayList;

import GameBackend.Vessels.Vessel;

public class Weapon extends Subsystem {

	int damage = 0;
	int maxTargets = 1;
	int damageType = 0;
	// -1 = healing
	// 1 = generic
	// 2 = shield damaging only
	// 3 = shield piercing straight to health
	// 4 = subsystem remover
	// 5 = cargo remover
	
	public Weapon(Vessel owner, int damage, int damageType) {
		super(owner);
		damage = this.damage;
		damageType = this.damageType;
		// TODO Auto-generated constructor stub
	}

	public int getDamage() {
		return damage;
	}
	
	/*
	 * public void attack(ArrayList<Vessel> weaponTargets) { for (Vessel instTarget
	 * : weaponTargets) { for (Shield instShield : instTarget.getShields()) {
	 * instShield.addShieldValue(damage); } } }
	 */
	
	public int getMaxTargets() {
		return maxTargets;
	}
	
	public int getDamageType() {
		return damageType;
	}
	
	public String getDamageTypeString() {
		String output = null;
		if (damageType == -1) {
			output = "healing beam";
		}
		if (damageType == 1) {
			output = "generic blaster";
		}
		if (damageType == 2) {
			output = "EMP bolter";
		}
		if (damageType == 3) {
			output = "shield-piercing lance";
		}
		if (damageType == 4) {
			output = "anti-subsystem gun";
		}
		if (damageType == 5) {
			output = "cargo-destroying missile";
		}
		return output;
	}
	
	public int attack(ArrayList<Vessel> weaponTargets) { 
		if (weaponTargets.size() > maxTargets) {
			return 0;
		}
		for (Vessel instTarget : weaponTargets) { 
			if (damageType == -1) {
				instTarget.modifyHealth(damage);
			}
			if (damageType == 1) {
				instTarget.modifyHP(-damage);
			}
			if (damageType == 2) {
				instTarget.modifyShields(-damage);
			}
			if (damageType == 3) {
				instTarget.modifyHealth(-damage);
			}
			if (damageType == 4) {
				instTarget.damageSubsystem(damage);
			}
			if (damageType == 5) {
				instTarget.damageCargo(damage);
			}
		}
		return 1;
	}
}
