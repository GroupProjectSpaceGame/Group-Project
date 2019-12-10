package userInterface;
import java.util.Random;

import GameBackend.Areas.Area;
import GameBackend.Subsystems.BlockerShield;
import GameBackend.Subsystems.PoolShield;
import GameBackend.Subsystems.Subsystem;
import GameBackend.Subsystems.Weapon;
import GameBackend.Vessels.Ship;
import GameBackend.Vessels.Vessel;

public class GameWorld {
	
	public static Random globalRand = new Random(System.currentTimeMillis());

	public void generateAreas() {
		
	}
	
	public Vessel generateShip(Area parentArea) {
		Vessel newShip = new Vessel(parentArea);
		if (globalRand.nextDouble() > 0.5) {
			Subsystem newShield = new PoolShield(newShip, globalRand.nextInt(100));
			// System.out.print(globalRand.nextInt(100));
			newShip.addSubsystem(newShield);
		} else {
			Subsystem newShield = new BlockerShield(newShip, globalRand.nextInt(100));
			newShip.addSubsystem(newShield);			
		}
		int randomInt = globalRand.nextInt(5);
		if (randomInt == 0) {
			randomInt -= 1;
		}
		for (int i = 0; i < (globalRand.nextInt(4)); i++) {
			Weapon newWeapon = new Weapon(newShip, globalRand.nextInt(globalRand.nextInt(50)), randomInt);
			newShip.addSubsystem(newWeapon);
		}
		parentArea.addVessel(newShip);
		// System.out.print(newShip.getHealth() + "\n" + newShip.getShieldsTotal() + "\n" + newShip.getWeapons()+ "\n\n");
		return newShip;
	}
	
	public void generateLoot() {
		
	}
	
}
