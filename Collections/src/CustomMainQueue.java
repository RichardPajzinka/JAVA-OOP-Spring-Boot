import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class CustomMainQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new PriorityQueue<>();
		queue.addAll(List.of("zebra", "Monkey", "CAt"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}

}
