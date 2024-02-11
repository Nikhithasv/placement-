import java.util.Scanner;

public class helloworld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("eenter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        print(nums);

    }

    public static void print(int[] nums) {
        long maxp = Long.MIN_VALUE;
        int[] maxs = new int[3];

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    long product = (long) nums[i] * nums[j] * nums[k];
                    if (product > maxp) {
                        maxp = product;
                        maxs[0] = nums[i];
                        maxs[1] = nums[j];
                        maxs[2] = nums[k];
                    }
                }
            }
        }

        System.out.println("subset with largest product: " + maxs[0] + ", " + maxs[1] + ", " + maxs[2]);
    }
}
