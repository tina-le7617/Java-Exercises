import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(fibonacci(n));

        System.out.print("#: ");
        Scanner scan = new Scanner(System.in);
        int numFib = scan.nextInt();

        for(int i = 2; i < numFib; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scan.close();
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
