import java.util.*;

public class LongestSubarrayDivby7 {

    public static void displayArray(int start, int end, int arr[]) {
        System.out.println("StartIndex: " + start + " EndIndex: " + end);
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int arrayDivisible(int arr[], int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        int count = 0;

        
        hm.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            int rem = ((sum % k) + k) % k;

            if (hm.containsKey(rem)) {
                int start = hm.get(rem) + 1;
                maxLength = Math.max(maxLength, i - hm.get(rem));
                displayArray(start, i, arr);
                count++;
            } else {
                hm.put(rem, i);
            }
        }

        System.out.println("The count of subarray is: " + count);
        return maxLength;
    }

    public static boolean isDivisible(int arr[], int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;

        hm.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            int rem = ((sum % k) + k) % k;

            if (hm.containsKey(rem)) {
                return true;
            }

            hm.put(rem, i);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the array elements:");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        int subarrayLength = arrayDivisible(arr, k);
        System.out.println("Max Length: " + subarrayLength);

        boolean check = isDivisible(arr, k);
        System.out.println("Is divisible subarray exists: " + check);
    }
}
