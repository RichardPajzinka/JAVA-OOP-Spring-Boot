package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectlyScanMain {

	public static void main(String[] args) throws IOException {

		Path currentDirectory = Paths.get(".");
		Path pathFileToRead = Paths.get("./file/data.txt");
		/*
		 * List<String> lines = Files.readAllLines(pathFileToRead);
		 * System.out.println(lines);
		 */

		Files.lines(pathFileToRead).forEach(System.out::println);

	}

}
