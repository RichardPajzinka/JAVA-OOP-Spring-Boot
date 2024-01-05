package exeption_handling;

public class ExeptionHandlingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		System.out.println("method ended");
	}

	private static void method1() {
		method2();
		System.out.println("method2 ended");
	}

	private static void method2() {
		String str = null;
		str.length();
		System.out.println("method1 ended");
	}

}
