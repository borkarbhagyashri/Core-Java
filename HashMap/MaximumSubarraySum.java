import java.util.*;
public class MaximumSubarraySum {
    public static int arraySum(int arr[],int k){
       HashMap<Integer,Integer>hm = new HashMap<>();
       int sum =0;
       int maxLength=0;
       for(int i=0;i<arr.length;i++){
        sum = sum+arr[i];
        if(sum==k){
            maxLength = Math.max(maxLength,i+1);
        }
        int rem = sum -k;
        if(hm.containsKey(rem)){
            maxLength = Math.max(maxLength,i-hm.get(rem));
        }
       if(!hm.containsKey(sum)){
        hm.put(sum,i);
       }
       }
   return maxLength;
    }
   public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
   System.out.println("enter the size of array:");
   int size = sc.nextInt();
   int arr[]= new int[size];
   for(int i=0;i<arr.length;i++){
    System.out.println("enter the array elements:");
    arr[i] = sc .nextInt();
   }
   System.out.println("enter the value of k:");
   int k = sc .nextInt();
   int subarrayLength = arraySum(arr, k);
   System.out.println(subarrayLength);
       
   }
    
}
