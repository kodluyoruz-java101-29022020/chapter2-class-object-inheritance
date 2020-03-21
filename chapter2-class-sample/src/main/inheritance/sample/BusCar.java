package main.inheritance.sample;

public class BusCar extends Car{

	private int seatCount;
	
	public void setSeatcCount(int seatCount2) {
		this.seatCount = seatCount2;
	}
	
	@Override
	public void showInfo() {
		
		System.out.println("<< BusCar Info >>");
		super.showInfo();
		System.out.println(this.seatCount);
	}
	
}
