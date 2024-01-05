import java.util.List;

public class FunctionalProgramingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = List.of("Apple", "Bat", "Cat", "dog");
		// print any list
		printWithFPWithFiltering(list);

	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void printBasicWithFiltering(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at"))
				System.out.println(string);
		}
	}

	// functional programing
	private static void printWithFP(List<String> list) {
		list.stream().forEach(
				// lambda expression
				element -> System.out.println("element - " + element));
	}

	private static void printWithFPWithFiltering(List<String> list) {
		list.stream()

				.filter(element -> element.endsWith("at")).forEach(
						// lambda expression
						element -> System.out.println("element - " + element));
	}
}


