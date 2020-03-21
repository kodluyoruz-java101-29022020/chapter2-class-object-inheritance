package main.inheritance.sample;

public class TruckCar extends Car {

	private boolean towingTruckEnabled = false;
	
	public void enableTowingTruck(boolean towingTruckEnabled2) {
		this.towingTruckEnabled = towingTruckEnabled2;
	}
	
	@Override
	public void showInfo() {
		
		System.out.println("<< TruckCar Info >>");
		super.showInfo();
		System.out.println(this.towingTruckEnabled);
	}
	
}
