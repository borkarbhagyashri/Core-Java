import java.util.*;

public class ZeroSumSubarray {

    public static void ZeroSumSubarray_fun(int[] arr) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxLength = 0;
        int sum = 0;
        int count = 0;

        
        hm.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (hm.containsKey(sum)) {
                count = count + hm.get(sum);
                maxLength = Math.max(maxLength, i + 1);
            }

            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Subarray with sum 0 exists: " + (count > 0));
        System.out.println("Longest Subarray length with sum 0: " + maxLength);
        System.out.println("Count of subarrays with sum 0: " + count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        
        ZeroSumSubarray_fun(arr);

        
    }
}
