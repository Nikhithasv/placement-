import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {

        int[] array1= {5, 8, 7, 9};

        int total = 0;
        for (int num=0;num<array1.length;num++) {
            total += num;
        }

        boolean flag = false;
        for (int i = 0; i < Math.pow(2,array1.length); i++) {
            int subset = 0;
            for (int j = 0; j < array1.length; j++) {
                if ((i & (1 << j)) > 0) {
                    subset += array1[j];
                }
            }
            if (subset == total - subset) {
                flag = true;
                break;
            }
        }

        System.out.println(flag);

    }
}

//