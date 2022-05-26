import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] numbers = { 1, 4, 5, 2, 7, 3, 9, 2 };
        System.out.println(containsDuplicate(numbers));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<Integer>();
        for (int num : nums) {
            if (numbers.contains(num))
                return true;
            numbers.add(num);
        }

        return false;
    }

    public static boolean containsDup(int[] nums){
        Set<Integer> number = new HashSet<Integer>();
        for(int num : nums) {
            if (number.contains(num)){
                return true;
            } 
            number.add(num);
        }
        return false;
    }
}
