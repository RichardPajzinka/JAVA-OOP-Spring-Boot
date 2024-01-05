package FileReadMain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class FileScanMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// functional porgramovanie
		Path currentDirectory = Paths.get(".");
		//BiPredicate<Path, BasicFileAttributes> matcher =
		//(path, attributes) -> String.valueOf(path).contains(".java");
		BiPredicate<Path, BasicFileAttributes> directoryMatcher =
		(path, attributes) -> attributes.isDirectory();
		Files.find(currentDirectory, 4, directoryMatcher);
	}

}
