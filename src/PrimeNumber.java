public class PrimeNumber {
    public static void main(String[] args) {
        int n = 17;
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int num) {
        // If it's divisible by itself and 1
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            } 
        }
        return true;
    }
}
