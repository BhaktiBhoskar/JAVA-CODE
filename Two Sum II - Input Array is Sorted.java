public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-based index
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1}; // not found case
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        int[] ans = twoSum(arr, target);
        System.out.println(ans[0] + " " + ans[1]);  // Output: 1 2
    }
}
