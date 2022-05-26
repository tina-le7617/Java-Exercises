import java.util.LinkedList;
import java.util.List;

public class IndexesOfChar {
    public static void main(String[] args) {
        String word = "tacocat";
        char letter = 'a';
        System.out.println(indexOfChar(word, letter));

        String hunnybunny = "hunnybunnylittlebunny";
        String substring = "bunny";

        System.out.println(indicesOfSubString(hunnybunny, substring));
    }

    public static List<Integer> indexOfChar(String s, char c) {

        // Create List interface with LinkedList
        List<Integer> numbers = new LinkedList<Integer>();

        // Loop through each character in a string
        for (int i = 0; i < s.length(); i++) {

            // If char at index i of string equals char c
            if (s.charAt(i) == c) {

                // Add the index of where it hits that char c
                numbers.add(i);
            }
        }
        return numbers;
    }

    public static List<Integer> indicesOfSubString(String word, String sub) {

        // Create List interface with LinkedList
        List<Integer> numbers = new LinkedList<Integer>();

        // Loop through each char. in word
        for (int i = 0; i < word.length() - sub.length() + 1; i++) {

            // Need first char. at sub
            if (sub.charAt(0) == word.charAt(i)) {

                // Boolean to make sure entire substring exists
                boolean checksOut = true;

                // Loop through again to Check if word also contains entire substring
                for (int j = 1; j < sub.length(); j++) {
                    if (sub.charAt(j) != word.charAt(i + j)) {
                        checksOut = false;

                        // Stop once you hit end of substring
                        break;
                    }
                }

                // Add first index of substring to list
                if (checksOut) {
                    numbers.add(i);
                }
            }
        }
        // Return ONLY the first index of substring
        return numbers;
    }
}
