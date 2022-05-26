import java.util.HashMap;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        int[] myNum = { 1, 2, 3 };
        for (int i : myNum) {
            System.out.print(i + " ");
        }
        HashMap<String, String> words = new HashMap<String, String>();
        words.put("1", "One");
        words.put("2", "Two");
        words.put("3", "Three");
        words.put("4", "Four");
        words.put("5", "Five");
        System.out.println(words);
        // int a = 1;
        // int[] arrayOne = { 1, 4, 5, 2, 7, 3, 9, 2 };
        // Integer[] arrayTwo = { 5, 2, 4, 9, 5 };
        
        // String word = "Hi";
        String[] cars = { "Toyota" };

        System.out.println(cars[0]);

        LinkedList<String> linky = new LinkedList<String>();
        linky.add("Hi");
        System.out.println(linky);
    }
}
