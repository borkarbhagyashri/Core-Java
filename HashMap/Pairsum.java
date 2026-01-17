import java.util.*;

public class Pairsum {

    public static int pairSum_fun(int[] nums, int k) {

        int count = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>(nums.length * 2);
        map.put(0, 1);

        for (int num : nums) {
            sum = sum + num;
            count = count + map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int k = sc.nextInt();

        int result = pairSum_fun(arr, k);
        System.out.println("Number of subarrays with sum = " + k + " is: " + result);
    }
}
