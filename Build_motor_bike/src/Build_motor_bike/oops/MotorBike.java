package Build_motor_bike.oops;

public class MotorBike {
	// state
	// nemože byt pristup z inej class
	private int speed; // member variable

	// construction
	MotorBike(int speed) {
		this.speed = speed;
	}

	MotorBike() {
		// volanie dalseiho construcotra v inom
		this(5);
	}
	// behavior
	void start() {
		System.out.println("Bike started");
	}

	public int getSpeed() {
		return speed;

	}

	public void setSpeed(int speed) {
		// this.speed = speed;
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	public void vypis() {
		System.out.println(getSpeed());
	}



}
