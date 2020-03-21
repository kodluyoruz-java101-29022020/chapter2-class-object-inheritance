package main.inheritance.sample;

public class Car {

	// aracın marka bilgisi
	protected String brand;
	
	// aracın plaka bilgisi
	protected String plateNumber;
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void showInfo() {
		System.out.println(this.plateNumber);
		System.out.println(this.brand);
	}
}
