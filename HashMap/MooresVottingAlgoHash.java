import java.util.*;
public class MooresVottingAlgoHash {
    public static int moores_Fun(int [] arr){
        HashMap<Integer , Integer> hm = new HashMap<>();

      
        int size = arr.length;

        for(int i=0 ; i<size ; i++){
            hm.put(arr[i] , hm.getOrDefault(arr[i], 0)+1);
            if(hm.get(arr[i])>(size/2)){
                return arr[i];
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size = sc.nextInt();
        System.err.println("enter the elements in array:");
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc .nextInt();
        }
        int count = moores_Fun(arr);
        System.out.println("the element found is:"+ count);
    }

    
    
    
}
