package GameBackend.Subsystems;

import GameBackend.Vessels.Vessel;

public class PoolShield extends Shield {

	private int shieldValue = 0;

	public PoolShield(Vessel owner, int initialShieldValue) {
		super(owner, initialShieldValue);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addShieldValue(int addvalue) {
		this.shieldValue += addvalue;
	}

}
