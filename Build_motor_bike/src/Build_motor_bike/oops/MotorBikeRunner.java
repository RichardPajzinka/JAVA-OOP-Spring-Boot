package Build_motor_bike.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);

		// System.out.println(honda.getSpeed());
		honda.vypis();
		ducati.vypis();

		honda.start();
		ducati.start();

		ducati.setSpeed(100);
		honda.getSpeed();
		//System.out.println(ducati.getSpeed());
		honda.setSpeed(60);
		// System.out.println(ducati.getSpeed());
		honda.getSpeed();
		//System.out.println(honda.getSpeed());

		// get speed
		// increase
		// set it to ducati
		ducati.increaseSpeed(200);
		honda.increaseSpeed(100);
		ducati.decreaseSpeed(50);
		honda.decreaseSpeed(50);

		System.out.println(honda.getSpeed());
		System.out.println(ducati.getSpeed());
	}

}
