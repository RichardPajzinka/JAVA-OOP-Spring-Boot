import java.util.List;

public class MethodReferenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List.of("Cat","dog","elephant","ant").stream().map(s-> s.length()).forEach(s->System.out.println(s));
	}

}
