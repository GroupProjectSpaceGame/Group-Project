package GameBackend.Subsystems;

import GameBackend.Vessels.Vessel;

public class Shield extends Subsystem {

	private int shieldValue = 0;
	
	public Shield(Vessel owner, int initialShieldValue) {
		super(owner);
		shieldValue = initialShieldValue;
		// TODO Auto-generated constructor stub
	}

	public int getShieldValue() {
		return shieldValue;
	}
	
}

