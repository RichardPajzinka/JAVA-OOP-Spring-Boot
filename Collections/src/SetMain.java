import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		// sorted unique character
		// unique - set
		// tree
		// hash
		// linkedHash

		// tree
		Set<Character> treeSet = new TreeSet(characters);
		System.out.println(treeSet);

		// hasSet
		Set<Character> linkedHashSet = new LinkedHashSet(characters);
		System.out.println(linkedHashSet);

		Set<Character> hashSet = new HashSet(characters);
		System.out.println(hashSet);
	}

}
