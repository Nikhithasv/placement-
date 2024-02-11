import java.util.*;

public class LargeIntegerSubtraction {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 5, 3};
        int[] b = {5, 8, 7, 9};

        String x = "";
        String y = "";
        
        for (int i = 0; i < a.length; i++) {
            x = x + a[i];
        }
        for (int i = 0; i < b.length; i++) {
            y = y + b[i];
        }
        
        int n = Integer.parseInt(x);
        int m = Integer.parseInt(y);
        
        int result = n - m;
        String res = Integer.toString(result);
        int len = res.length();
        int[] r = new int[len];
        for (int i = 0;i<len;i++) {
            r[i] = Character.getNumericValue(res.charAt(i));
        }
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i]+",");
        }
    }
}
