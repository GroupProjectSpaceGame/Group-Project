package GameBackend.Cargos;

import GameBackend.Subsystems.Shield;
import GameBackend.Vessels.Vessel;

public class BoosterShield extends Booster {

	private int boostValue = 0;
	
	public BoosterShield(Vessel owner, int boostValue) {
		super(owner);
		boostValue = this.boostValue;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void consume() {
		// TODO Auto-generated method stub
		for (Shield instShield : this.getOwner().getShields()) {
			instShield.addShieldValue(boostValue);
		}
		

	}

}
