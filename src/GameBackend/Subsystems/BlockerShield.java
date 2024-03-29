package GameBackend.Subsystems;

import GameBackend.Vessels.Vessel;
import javafx.util.Pair;

public class BlockerShield extends Shield {

	private int shieldValue = 0;

	public BlockerShield(Vessel owner, int initialShieldValue) {
		super(owner, initialShieldValue);
		shieldValue = (int)	(Math.floor(Math.cbrt(initialShieldValue)) + 1);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int addShieldValue(int addvalue) {
		int overflow = 0;
		if (addvalue > 0) {
			this.shieldValue += (Math.floor(Math.cbrt(addvalue)) + 1);
		} else if (addvalue < 0) {
			this.shieldValue -= 1;
		}
		if (this.shieldValue <= 0) {
			overflow = (this.shieldValue);
		}
		return overflow;
	}

}
