import java.util.*;
public class twoPointer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- != 0) {
            int n = in.nextInt();
            String str = in.next();

            String ans = fun(str, n);
            System.out.println(ans);
        }
    }

    private static String fun(String s, int n) {
        char[] chars = s.toCharArray();
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (j >= 2 && chars[j - 2] == 'B' && chars[j - 1] == 'I' && chars[i] == 'T') j -= 2;
            else chars[j++] = chars[i];
        }

        return new String(chars, 0, j);
    }
}
