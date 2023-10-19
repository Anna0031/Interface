package Interface;
interface Vehicle{
	void startEngine();
	void stopEngine();
}

class Car implements Vehicle{

	@Override
	public void startEngine() {
		System.out.println("Car is started");
	}

	@Override
	public void stopEngine() {
		System.out.println("Car is stoped");

		
	}
	
}

class Motorcycle implements Vehicle{

	@Override
	public void startEngine() {
		System.out.println("Vehicle is started");

	}

	@Override
	public void stopEngine() {
		System.out.println("Vehicle is stoped");

	}
	
}
public class Q2 {

	public static void main(String[] args) {
		
		Car cc = new Car();
		cc.startEngine();
		cc.stopEngine();
		
		Motorcycle vv = new Motorcycle();
		vv.startEngine();
		vv.stopEngine();
		
		

	}

}