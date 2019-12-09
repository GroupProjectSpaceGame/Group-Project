package GameBackend.Areas;

import java.util.ArrayList;

import GameBackend.Cargos.Cargo;
import GameBackend.Vessels.Vessel;

public class Area {

	ArrayList<Vessel> vesselsHere = new ArrayList<>();
	ArrayList<Cargo> cargoHere = new ArrayList<>();
	
	public Area() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Vessel> getVesselsList() {
		return vesselsHere;
	}

	public ArrayList<Cargo> getCargoList() {
		return cargoHere;
	}
	
}
