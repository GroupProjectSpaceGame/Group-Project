package GameBackend.Subsystems;

import GameBackend.Vessels.Vessel;
import javafx.util.Pair;

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
	
	public int addShieldValue(int addvalue) {
		return 0;
		// stub for extending
	}
	
}

