import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("assets/words.txt"));
		ArrayList<String> words = new ArrayList<>();
		while (scanner.hasNext()) {
			words.add(scanner.next());
		}
		// Task 1
		for (int j = words.size() - 1; j >= 0 ; j--) {
			System.out.print(words.get(j) + " ");
		}
		System.out.println();
		// Task 2
		for (int i = 0; i < words.size(); i++) {
			String word = words.get(i);
			if (word.endsWith("s")) {
				System.out.print(word.toUpperCase());
			} else {
				System.out.print(word);
			}
			System.out.print(" ");
		}

		System.out.println();

		// Task 3
		for (int i = 0; i < words.size(); i++) {
			String word = words.get(i);
			if (!word.endsWith("s")) {
				System.out.print(word + " ");
			}
		}


	}
}
