package userInterface;

import java.util.ArrayList;

import GameBackend.Areas.Area;
import GameBackend.Subsystems.Weapon;
import GameBackend.Vessels.Ship;
import GameBackend.Vessels.Vessel;

public class TUI {

	public static void main(String[] args) {
		Area testArea = new Area();
		ArrayList<Vessel> allShips = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Vessel newShip = new GameWorld().generateShip(testArea);
			allShips.add(newShip);
		}
		Vessel player = new GameWorld().generateShip(testArea);
		System.out.print("Welcome! You are in " + testArea + ".");
		System.out.print("\nYour ship has " + player.getHealth() + "health and " + player.getShields().size() + " shield modules with a total of " + player.getShieldsTotal() + " points of shielding.");
		for (Vessel instShip : allShips) {
			System.out.print("\n\nEnemy ship. Health:" + instShip.getHealth() + ", Shielding:" + instShip.getShieldsTotal() + ", Weapons:");
			for (Weapon instWeapon : instShip.getWeapons()) {
				System.out.print("\n- " + instWeapon.getDamageTypeString() + " (effectiveness = " + instWeapon.getDamage() + ")");
			}
		}
		
		
		System.out.print("\n\n1 = Look around\n2 = Attack enemy targets");
		
	}

}
