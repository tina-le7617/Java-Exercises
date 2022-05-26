public class Whiteboard {
    // Given a string, bananas, remove duplicate characters
    public static void main(String args[]) {
        String s = "bananas";

        // Unique string
        String unique = "";

        // Loop through the string, access each character at the string
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            // Loop through unique string
            for (int j = 0; j < unique.length(); j++) {
                // If unique string doesn't have a char. in my original string
                if (s.charAt(i) == unique.charAt(j)) {
                    found = true;
                    break;
                }
            }
            // If my flag hits false,
            // Add the unique character into unique string
            if (!found)
                unique += s.charAt(i);
        }
        System.out.print(unique);
    }
}
