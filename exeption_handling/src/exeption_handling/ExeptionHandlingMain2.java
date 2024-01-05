package exeption_handling;

public class ExeptionHandlingMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		System.out.println("main ended");
	}

	private static void method1() {
		method2();
		System.out.println("method2 ended");
	}

	private static void method2() {
		try {
			// String str = null;
			// str.length();
			int[] i = { 1, 2 };
			int number = i[3];
		System.out.println("method1 ended");
	} catch (NullPointerException ex) {
		System.out.println("NullPointerexeption");
		ex.printStackTrace();
	} catch (Exception ex) {
		System.out.println("matched Exeption");
		ex.printStackTrace();
	}

	}

}
