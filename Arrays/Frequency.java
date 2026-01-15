import java.util.*;

public class Frequency {

    public static void frequencyCount(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print("{");

        int i = 0;                  
        int size = hm.size();       

        for (Map.Entry<Integer, Integer> map : hm.entrySet()) {
            int key = map.getKey();
            int value = map.getValue();

            if (i != size - 1) {
                System.out.print(key + ":" + value + ", ");
            } else {
                System.out.print(key + ":" + value);
            }
            i++;
        }

        System.out.print("}");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        frequencyCount(arr);
    }
}