import java.util.*;

public class permutationWithDuplicate {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr = {1, 2, 1, 3};
        helper(arr, 0, ans);
        System.out.println(ans);
    }

    private static void helper(int[] arr, int index, List<List<Integer>> ans) {
        if(index >= arr.length) {
            List<Integer> list = new ArrayList<>();
            for(int n : arr) {
                list.add(n);
            }
            ans.add(new ArrayList<>(list));
            return;
        }

        Set<Integer> set = new HashSet<>();
        for(int i = index; i < arr.length; i++) {
            if(set.contains(arr[i])) continue;
            set.add(arr[i]);
            swap(arr, index, i);
            helper(arr, index + 1, ans);
            swap(arr, index, i);
        }
    }

    private static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    } 
}
