package main.inheritance.sample;

public class Main {

	public static void main(String[] args) {
		
		Car baseCar = new Car();
		baseCar.setBrand("BMW");
		baseCar.setPlateNumber("34 AN 2342");
		
		ElectricCar electricCar = new ElectricCar();
		electricCar.setBrand("Tesla");
		electricCar.setPlateNumber("45 AN 5322");
		electricCar.charge(200);
		
		TruckCar truckCar = new TruckCar();
		truckCar.setBrand("BMC");
		truckCar.setPlateNumber("54 AN 3341");
		truckCar.enableTowingTruck(true);
		
		BusCar busCar = new BusCar();
		busCar.setBrand("Mercedes");
		busCar.setPlateNumber("06 AN 4342");
		busCar.setSeatcCount(54);
		
		
		Car[] cars = new Car[4];
		cars[0] = electricCar;
		cars[1] = truckCar;
		cars[2] = baseCar;
		cars[3] = busCar;
		
		printCarInfo(cars);
		
		
		// upcasting yaptık
		Car car3 = electricCar;
		
		// downcasting yaptık
		ElectricCar electricCar4 = (ElectricCar)car3;
		
		// upcasting yaptık.
		Car car4 = truckCar;
		
		// downcasting'de runtime hatası alırsınız.
		// ElectricCar electricCar5 = (ElectricCar)car4;
		
		TruckCar truckCar2 = (TruckCar)car4;
	}
	
	public static void printCarInfo(Car[] cars) {
		
		for(Car car : cars) {
			
			car.showInfo();
			System.out.println("-------------");
		}
		
		/*for(int i=0; i < cars.length; i++) {
		
			Car car = cars[i];
			car.showInfo();
			System.out.println("-------------");
		}*/
	}
	
}
