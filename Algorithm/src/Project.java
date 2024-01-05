
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ak budeme mat velky kod tak stači nam v tejto logike zmenit iba dummy na real
		// a už sa použije ina class s inou logikou
		ComplexAlgorithm algorithm = new RealAlgorithm();
		System.out.println(algorithm.complexAlgorithm(10, 20));
	}

}
