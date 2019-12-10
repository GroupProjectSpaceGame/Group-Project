package GameBackend.Vessels;

import java.util.ArrayList;
import java.util.Random;

import GameBackend.Areas.Area;
import GameBackend.Cargos.Booster;
import GameBackend.Cargos.Cargo;
import GameBackend.Subsystems.Shield;
import GameBackend.Subsystems.Subsystem;

public class Vessel {

	Random rand = new Random(System.currentTimeMillis());
	
	boolean alive = true;
	private int health = 0;
	private Area currentArea = null; 
	private ArrayList<Cargo> currentCargo = new ArrayList<>();
	private ArrayList<Subsystem> currentSubsystems = new ArrayList<>();
	
	public Vessel(Area initialArea) {
		// TODO Auto-generated constructor stub
		currentArea = initialArea;
	}

	public Area getArea() {
		return currentArea;
	}
	
	public int getHealth() {
		return health;
	}
	
	public boolean isAlive() {
		return alive;
	}
	
	public ArrayList<Cargo> getCargo() {
		return currentCargo;
	}
	
	public ArrayList<Subsystem> getSubsystems() {
		return currentSubsystems;
	}
	
	public ArrayList<Shield> getShields() {
		ArrayList<Shield> currentShields = new ArrayList<>(); 
		for (Subsystem instShield : getSubsystems()) {
			if (instShield.getClass() == Shield.class) {
				currentShields.add((Shield) instShield);
			}
		}
		return currentShields;
	}
	
	public void addSubsystem(Subsystem newSubsystem) {
		currentSubsystems.add(newSubsystem);
	}
	
	public void consumeBooster(Booster targetBooster) {
		if (currentCargo.contains(targetBooster)) {
			targetBooster.consume();
			currentCargo.remove(targetBooster);
		}
	}

	public void modifyHP(int input) {
		if (this.getShields().size() > 0) {
			int overflow = input;
			for (Shield instShield : this.getShields()) {
				overflow = instShield.addShieldValue(overflow);
				if (overflow <= 0) {
					currentSubsystems.remove(instShield);
				}
			}
			health += overflow;
			if (health <= 0) {
				alive = false;
			}
		}
	}

	public void modifyShields(int input) {
		if (this.getShields().size() > 0) {
			int overflow = input;
			for (Shield instShield : this.getShields()) {
				overflow = instShield.addShieldValue(overflow);
				if (overflow <= 0) {
					currentSubsystems.remove(instShield);
				}
			}
		}
	}

	public void modifyHealth(int input) {
		health += input;
		if (health <= 0) {
			alive = false;
		}
	
	}

	public void damageCargo(int damage) {
		if (currentCargo.size() > 0) {
			while (damage > 0) {
				double randomValue = rand.nextDouble();
				double threshold = (Math.log10(damage))*0.5;
				if (randomValue <= threshold) {
					currentCargo.remove(currentCargo.get(rand.nextInt(currentCargo.size())));
					damage = (int) (threshold - randomValue); 
				} else {
					damage = 0;
				}
			}
		}
	}

	public void damageSubsystem(int damage) {
		if (currentSubsystems.size() > 0) {
			while (damage > 0) {
				double randomValue = rand.nextDouble();
				double threshold = (Math.log10(damage))*0.5;
				if (randomValue <= threshold) {
					currentSubsystems.remove(currentSubsystems.get(rand.nextInt(currentSubsystems.size())));
					damage = (int) (threshold - randomValue); 
				} else {
					damage = 0;
				}
			}
		}
	}
}
