package oops;

public class carTest {
	
	public static void main(String[] args) {
		vehicle car = new vehicle();
		bmw carbmw = new bmw();
		vehicle car3= new bmw();
		System.out.println("The car has "+ car.wheels + " wheels");
		vehicle car2= new vehicle();
		System.out.println("The car has "+ car2.wheels + " wheels");


		System.out.println("BMW CLASS Output : "+ carbmw.wheels);
		carbmw.honk();

		car.honkAt(carbmw);   //subclass in superclass method-> objject interacting with object
		car.honkAt(car);


		
	}

}
