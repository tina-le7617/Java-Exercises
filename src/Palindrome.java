public class Palindrome {
    public static void main(String[] args) {
        String original = "racecar";
        System.out.println(isPalindrome(original));
    }

    // Create a function that takes in a String argument and returns a boolean if
    // it's a palindrome or not
    public static boolean isPalindrome(String str) {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            // Increment first pointer
            // and decrement the other
            i++;
            j--;
        }
        return true;
    }
}

/*
 * String reverse = "";
 * for (int i = original.length() - 1; i >= 0; i--) {
 * reverse += original.charAt(i);
 * }
 * 
 * boolean palindrome = true;
 * 
 * for (int i = 0; i < original.length(); i++) {
 * if (original.charAt(i) != reverse.charAt(i)) {
 * palindrome = false;
 * }
 * }
 * if (palindrome) {
 * System.err.println("Palindrome");
 * } else {
 * System.out.println("Not a Palindrome");
 * }
 * 
 * boolean isPalindrome = true;
 * 
 * for(int i = 0, j = original.length() - 1; i < Math.ceil(original.length() /
 * 2); i++, j--) {
 * if(original.charAt(i) != original.charAt(j)) {
 * isPalindrome = false;
 * break;
 * }
 * }
 * 
 */
