
public class fanMain {
	public static void main(String[] args) {
		Fan fan = new Fan("manufacturer 1", 0.34567, "green");
		fan.switchOn();
		fan.setSpeed((byte) 5);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}
}
