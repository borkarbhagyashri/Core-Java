import java.util.*;
public class Mooores_Voting_Algo {
    public static int moores_fun(int [] arr){
        int n = arr.length;
        int ele = 0;
        int count = 0;
        for (int i=0;i<n;i++){
            if(count ==0){
                ele = arr[i];
                count++;
            }
            else if(arr[i] == ele ){
                count++;
            }
            else{
                count--;
            }
        }
        int count2 =0;
        for(int i=0;i<n;i++){
            if(arr[i]==ele){
                count2++;
            }
        } 
        if(count2>n/2){
            return  ele;
        }
        return  -1;
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
        int count = moores_fun(arr);
        System.out.println("the element found is:"+ count);
    }
}
