import java.util.Scanner;

public class StarPattern {
    public static void main(String args[]) {
        System.out.print("# stars: ");
        Scanner scan = new Scanner(System.in);
        int numStars = scan.nextInt();

        for (int i = 1; i <= numStars; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Reversing
        for (int i = numStars - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scan.close();
    }
}
