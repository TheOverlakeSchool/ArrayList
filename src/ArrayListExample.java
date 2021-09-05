import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("words.txt"));
        String[] words = new String[1000];
        int i = 0;
        ArrayList<String> words2 = new ArrayList<>();
        while (scanner.hasNext()) {
            words[i] = scanner.next();
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.println(words[j]);
        }
    }
}
