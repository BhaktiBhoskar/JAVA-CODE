import java.util.*;

class Solution {
    public int threeSumClosest(int[] A, int target) {
        Arrays.sort(A);
        int N = A.length, ans = A[0] + A[1] + A[2];
        for (int i = 0; i < N - 2; ++i) {
            int L = i + 1, R = N - 1;
            while (L < R) {
                int sum = A[L] + A[R] + A[i];
                if (Math.abs(sum - target) < Math.abs(ans - target)) ans = sum;
                if (sum == target) return target;
                if (sum > target) --R;
                else ++L;
            }
        }
        return ans;
    }
}
