import java.util.*;
class subsequence {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        List<Integer> list = new ArrayList<>();
        subsequence(arr, 0, list);
    }

    private static void subsequence(int[] arr, int index, List<Integer> list) {
        if(index >= arr.length) {
            System.out.println(list);
            return;
        }

        list.add(arr[index]);
        subsequence(arr, index + 1, list);
        list.remove(list.size() - 1);
        subsequence(arr, index + 1, list);
    }   
}