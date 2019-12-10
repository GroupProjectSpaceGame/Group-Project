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

	public void addVessel(Vessel newVessel) {
		vesselsHere.add(newVessel);
	}
	
	public void addCargo(Cargo newCargo) {
		cargoHere.add(newCargo);
	}
	
	@Override
	public String toString() {
		return "an area containing " + vesselsHere.size() + " ships and " + cargoHere.size() + " pieces of cargo";
	}
	
	
}
