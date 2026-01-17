import java.util.*;
public class MaxSubarraySum {
    public static int MaxLength_fun(int [] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int MaxLength = 0;
        int sum = 0;
        int size = arr.length;
        int k = 15;

        for(int i=0; i<size ; i++){
            sum = sum + arr[i];
            if(sum==k){
                MaxLength = Math.max(MaxLength,i+1);
            }
             int rem = sum - k;
            if(hm.containsKey(rem));
                MaxLength = Math.max(MaxLength , i-hm.get(rem));
            }
           
            if(!hm.containsKey(sum)){
                hm.put(sum,0);
            }
 return MaxLength;
        }
        // System.out.print(MaxLength);
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
   int subarrayLength = MaxLength_fun(arr);
   System.out.println(subarrayLength);
       
   }

        
    
}
    

