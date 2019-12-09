import java.util.Random;

import GameBackend.Areas.Area;
import GameBackend.Subsystems.BlockerShield;
import GameBackend.Subsystems.PoolShield;
import GameBackend.Subsystems.Subsystem;
import GameBackend.Vessels.Ship;

public class GameWorld {
	
	Random rand = new Random(System.currentTimeMillis());

	public void generateAreas() {
		
	}
	
	public Ship generateShip(Area parentArea) {
		Ship newShip = new Ship(parentArea);
		if (rand.nextInt(1) > 0) {
			Subsystem newShield = new PoolShield(newShip, rand.nextInt(100));
			newShip.addSubsystem(newShield);		
		} else {
			Subsystem newShield = new BlockerShield(newShip, rand.nextInt(100));
			newShip.addSubsystem(newShield);			
		}
		return newShip;
	}
	
	public void generateLoot() {
		
	}
	
}
