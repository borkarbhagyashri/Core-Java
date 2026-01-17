import java.util.Scanner;

public class LongestSubarrayDivby7Brute { 
    public static int subarray(int arr[],int k){
        int max = 0;
        int count =0;
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
                sum = sum +arr[j];
                int rem = ((sum % k) + k) % k;
                if(rem ==0){
                    max = Math.max(max,j-i+1);
                    count++;
                }
            
        }
        System.out.println(count);
      }  return  max;
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
        System.out.println("enter the  k");
        int k = sc.nextInt();
        int  result = subarray(arr,k);
        System.out.println("Zero sum subarray exists: " + result);
        
    }
    
}
