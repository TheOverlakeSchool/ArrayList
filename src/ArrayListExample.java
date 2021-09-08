import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("words.txt"));
        ArrayList<String> words2 = new ArrayList<>();
        while (scanner.hasNext()) {
            String word = scanner.next();
            words2.add(word);
        }

//        Collections.reverse(words2);
//        for (String word: words2) {
//            System.out.println(word);

//        for (String word: words2) {
//            System.out.println(uppercasePlurals(word));
//        }

//        words2.removeIf(s->s.endsWith("s"));
//
//        for (int i = 0; i < words2.size() - 1; i++){
//            if (words2.get(i).endsWith("s")) {
//                words2.remove(i);
//                i--;
//            }
//        }
//
//        for (String word: words2){
//            System.out.println(word);
//        }

        ArrayList<Integer> integers = new ArrayList<>();
        Integer five = new Integer(5);
        integers.add(five);
        integers.add(5);
        printInt(integers.get(0));
    }

    public static void printInt(int num) {
        System.out.println(num);
    }

    private static String uppercasePlurals(String word) {
        if (word.endsWith("s")) {
            String capital = word.substring(0, 1).toUpperCase() + word.substring(1);
            return capital;
        } else {
            return word;
        }
    }
}
