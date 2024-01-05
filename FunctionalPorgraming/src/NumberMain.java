import java.util.List;

public class NumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);

		// numbers.stream().forEach(element -> System.out.println(element));
		int sum = numbers.stream().filter(element -> element % 2 == 0).reduce(0,
				(number1, number2) -> number1 + number2);

		System.out.println(sum);

	}

	private static void normalSum(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		// return sum;
	}

	public int fpSum(List<Integer> numbers) {
		int sum = numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
		return sum;
	}

}
