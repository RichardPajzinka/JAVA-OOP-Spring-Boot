import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	private int number;

	public Task(int number) {
		this.number = number;
	}

	public void run() {
		for (int i = number * 100; i <= number * 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n Task1 Done");
	}
}

public class ExecutorServiceMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new Task1());
		executorService.execute(new Thread(new Task2()));

		// task3
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n Task3 Done");
		System.out.println("Main Done");

		// ukonči program
		executorService.shutdown();
	}

}
