import java.util.*;
public class SecondMax {

     
    public static int Occurance(int[] arr){
        int size = arr.length;
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i=0 ; i<size ; i++){
            hm.put(arr[i] , hm.getOrDefault(arr[i], 0)+1);
        }
        int firstMaxKey=0 ;
        int firstMaxValue=0;
        int secondMaxKey=0;
        int secondMaxValue=0;

        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();


            if(value>firstMaxValue){
                secondMaxValue = firstMaxValue;
                firstMaxValue = value;
                secondMaxKey = firstMaxKey;
                firstMaxKey = key;
            }
            else if(value>secondMaxValue && value != firstMaxValue){
                secondMaxValue = value;
                secondMaxKey = key;
            }
        }
        return secondMaxKey;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n ;i++){
            arr[i]= sc.nextInt();
        }
        
        int value = Occurance(arr);
        System.out.println(value);
    }
}

    

