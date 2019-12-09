package GameBackend.Subsystems;

import GameBackend.Vessels.Vessel;

public class Subsystem {

	private Vessel owner = null;
	
		public Subsystem(Vessel owner) {
		// TODO Auto-generated constructor stub
			owner = this.owner;
	}

		public Vessel getOwner() {
			return owner;
		}
		
}
