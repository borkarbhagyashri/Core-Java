import java.util.*;

public class zeroSumSubarray_H {

    public static boolean ZeroSumSubarray_fun(int[] arr) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        hm.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (hm.containsKey(sum)) {
                System.out.println("Zero sum subarray found from index "
                        + (hm.get(sum) + 1) + " to " + i);
                return true;
            } else {
                hm.put(sum, i);
            }
        }
        return false;
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

        boolean result = ZeroSumSubarray_fun(arr);
        System.out.println("Zero sum subarray exists: " + result);
    }
}
