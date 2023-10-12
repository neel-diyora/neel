import java.util.*;

public class permutation1 {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr = {1, 2, 3};
        helper(arr, new boolean[arr.length], new ArrayList<>(), ans);
        System.out.println(ans);
    }

    private static void helper(int[] arr, boolean[] visited, List<Integer> ds, List<List<Integer>> ans) {
        if(ds.size() == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = 0; i < visited.length; i++) {
            if(visited[i]) continue;
            ds.add(arr[i]);
            visited[i] = true;
            helper(arr, visited, ds, ans);
            ds.remove(ds.size() - 1);
            visited[i] = false;
        }
    }
}
