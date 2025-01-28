package Inheritance;

public class UI {
	public static void main(String[] args) {
		Car car=new Car();
		car.startEngine();
		
		ElectricCar Ec=new ElectricCar();
		Ec.chargeBattery();
		Ec.drive();
		
		Bike bike=new Bike();
		bike.startEngine();
		bike.kickStart();		
	}

}
