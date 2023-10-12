public class subseqPattern3 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 5;
        int count = subsequence(arr, 0, 0, k);
        System.out.println(count);
    }

    private static int subsequence(int[] arr, int index, int sum, int k) {
        // strickly done if array contains positives only
        if(sum > k) return 0;
        
        if(index >= arr.length) {
            if(sum == k) {
                return 1;
            }
            return 0;
        }

        int count = 0;

        sum += arr[index];
        count += subsequence(arr, index + 1, sum, k);
        

        sum -= arr[index];
        count += subsequence(arr, index + 1, sum, k);

        return count;
    }
}
