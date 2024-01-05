

class Task1 extends Thread {
		public void run() {
			for (int i = 101; i <= 199; i++) {
				System.out.print(i + " ");
			}
			System.out.println("\n Task1 Done");
		}
	}

	class Task2 implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 201; i <= 299; i++) {
				System.out.print(i + " ");
			}
			System.out.println("\n Task2 Done");
		}

	}

	public class ThreadbasicMain {

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * for (int i = 101; i <= 199; i++) { System.out.print(i + " "); }
		 */
		// System.out.println("\n Task1 Done");

		// Task1
		Task1 task1 = new Task1();
		// ak by sme tu dali task.run tak by nam to spustilo inak a nie ako thread
		task1.setPriority(10);
		task1.start();

		// Task2
		Task2 task2 = new Task2();
		Thread thread = new Thread(task2);
		thread.start();

		// WAI FOR TASK1 and task2 TO COMPLETE
		task1.join();
		// runnable
		thread.join();

		// Task3
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n Task3 Done");
		System.out.println("Main Done");


	}

}
