package exeption_handling;

public class CheckedExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * try { someOtherMethod(); Thread.sleep(5000); } catch (InterruptedException e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
		someOtherMethod2();
	}

	private static void someOtherMethod2() throws RuntimeException {
		// TODO Auto-generated method stub

	}

	private static void someOtherMethod() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
	}

}
