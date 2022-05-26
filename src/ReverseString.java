public class ReverseString {
    public static void main(String[] args) {
        String r = reverse("Hello");
        System.out.println(r);
    }

    public static String reverse(String s) {
        char[] letters = new char[s.length()];
        int letterIndex = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            letters[letterIndex] = s.charAt(i);
            letterIndex++;
        }

        String reverse = "";
        for(int i = 0; i < s.length(); i++) {
            reverse = reverse + letters[i];
        }
        return reverse;
    }

    public static String reverseAgain(String s) {
        String reverse = "";
        int i = 0, j = s.length() - 1;

        while (i < j) {
            reverse += s.charAt(j);
            i++;
        }
        return reverse;
    }
}
