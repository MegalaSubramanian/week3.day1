package week3.day1.assessment;

public class MyVehicle1 {
	
	public static void main(String[] args) {
		
		Vehicle1 vehicle = new Vehicle1();
		Car1 car = new Car1();
		Audi1 audi = new Audi1();
		
		audi.openDoor1();//from car class
		
		audi.autoPark1();//from audi class
		
		audi.soundHorn1();
		audi.applyBrake1();//from vehicle class
		
		vehicle.applyBrake1();
		vehicle.soundHorn1();
		
		car.openDoor1();
		car.applyBrake1();

		
		

	}
	

	

}
