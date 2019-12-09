package GameBackend.Vessels;

import java.util.ArrayList;

import GameBackend.Areas.Area;
import GameBackend.Cargos.Booster;
import GameBackend.Cargos.Cargo;
import GameBackend.Subsystems.Shield;
import GameBackend.Subsystems.Subsystem;

public class Vessel {

	private int expLevel = 0;
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
	
	public int getLevel() {
		return expLevel;
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
	
	
	
	public void consumeBooster(Booster targetBooster) {
		if (currentCargo.contains(targetBooster)) {
			targetBooster.consume();
			currentCargo.remove(targetBooster);
		}
	}
	
}
