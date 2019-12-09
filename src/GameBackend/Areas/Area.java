package GameBackend.Areas;

import java.util.ArrayList;

import GameBackend.Vessels.Vessel;

public class Area {

	ArrayList<Vessel> vesselsHere = new ArrayList<>();
	
	public Area() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Vessel> getVesselsList() {
		return vesselsHere;
	}
	
}
