import java.util.*;

public class subseqWithDuplicates {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 3};
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        helper(nums, 0, new ArrayList<>(), ans);
        System.out.println(ans);
    }

    private static void helper(int[] nums, int index, List<Integer> ds, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(ds));
        for(int i = index; i < nums.length; i++) {
            if(i > index && nums[i] == nums[i-1]) continue;
            
            ds.add(nums[i]);
            helper(nums, i + 1, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }
}
