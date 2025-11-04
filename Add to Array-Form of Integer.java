import java.util.*;

public class AddToArrayForm {
    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};  // Example number: 1200
        int k = 34;                // Number to add

        List<Integer> result = addToArrayForm(num, k);
        System.out.println("Result: " + result);
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }

            result.add(k % 10);  // Store last digit
            k /= 10;             // Remove last digit
        }

        // The result is in reverse order, so reverse it
        Collections.reverse(result);
        return result;
    }
}
