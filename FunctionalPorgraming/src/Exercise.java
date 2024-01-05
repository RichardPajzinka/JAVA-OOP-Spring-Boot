import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = List.of(23, 12, 34, 53);

		List<Integer> sum = number.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println(sum);

		List<Integer> tenSqueres = IntStream.range(1, 11).map(e -> e * e).boxed().collect(Collectors.toList());
		System.out.println(tenSqueres);
	}

}
