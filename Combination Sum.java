import java.util.*;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSumHelper(candidates, 0, target, new ArrayList<>(), res);
        return res;
    }
    
    private void combinationSumHelper(int[] candidates, int start, int target, List<Integer> path, List<List<Integer>> res) {
        if (target < 0) return;
        if (target == 0) {
            res.add(new ArrayList<>(path)); // add a copy
            return;
        }
        for (int i = start; i < candidates.length && candidates[i] <= target; i++) {
            path.add(candidates[i]);
            combinationSumHelper(candidates, i, target - candidates[i], path, res);
            path.remove(path.size() - 1); // backtrack
        }
    }
    
    // another readable version
    public List<List<Integer>> combinationSumAnother(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0) return res;
        Arrays.sort(candidates);
        helper(candidates, 0, target, new ArrayList<>(), res);
        return res;
    }
    
    private void helper(int[] candidates, int start, int target, List<Integer> path, List<List<Integer>> res) {
        if (target < 0) return;
        else if (target == 0) {
            res.add(new ArrayList<>(path)); // add a copy
        } else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) continue; // skip duplicates
                int curr = candidates[i];
                if (target - curr >= 0) {
                    path.add(curr);
                    helper(candidates, i, target - curr, path, res);
                    path.remove(path.size() - 1); // backtrack
                }
            }
        }
    }
}
