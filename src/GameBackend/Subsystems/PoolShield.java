package GameBackend.Subsystems;

import GameBackend.Vessels.Vessel;

public class PoolShield extends Shield {

	private int shieldValue = 0;

	public PoolShield(Vessel owner, int initialShieldValue) {
		super(owner, initialShieldValue);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int addShieldValue(int addvalue) {
		int overflow = 0;
		this.shieldValue += addvalue;
		if (this.shieldValue <= 0) {
			overflow = (this.shieldValue);
		} else {
			overflow = 1;
		}
		return overflow;
	}

}
