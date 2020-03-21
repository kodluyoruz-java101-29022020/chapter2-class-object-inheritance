package main.inheritance.sample;

public class ElectricCar extends Car 
{
	private double power = 0;
	
	public ElectricCar() {
		super.brand = "NO_BRAND";
		super.plateNumber = "NO_PLATE_NUMBER";
	}
	
	public void charge(double extraPower) {
		this.power += extraPower;
	}
	
	public void showPower() {
		System.out.println(this.power);
	}
	
	public void showMaxSpeed() {
		
		double maxSpeed = this.calculateMaxSpeed();
		System.out.println(maxSpeed);
	}
	
	private double calculateMaxSpeed() {
		
		double extraSpeed = this.power * 0.4;
		return power + extraSpeed;
	}
	
	@Override
	public void showInfo() {
		
		System.out.println("<< ElectricaCar Info >>");
		super.showInfo();
		System.out.println(this.power);
	}
	
	
	
	
	
}
