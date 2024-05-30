package oops;

class vehicle{
	int wheels; 
	vehicle(){
		wheels=4;
	}

	void horn(){
		System.out.println("Honk");
	}

	void honkAt(vehicle otherVehicle) {
		System.out.println("HONK! " + otherVehicle.getClass().getSimpleName() + " has been honked at.");
	}
}


//public class car {
//	public static void main(String[] args) {
//		vehicle car = new vehicle();
//		System.out.println("The car has "+ car.wheels + " wheels");
//		
//	}
//
//}
