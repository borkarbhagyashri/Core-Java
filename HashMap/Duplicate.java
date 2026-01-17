import java.util.HashMap;
public class Duplicate {
    public static void main(String[] args){
        HashMap<Integer , Integer>hm = new  HashMap<>();
        int arr[] = {1 , 2, 2, 3, 4, 5, 6};
        for(int i=0 ; i<arr.length ; i++){
            Integer key = arr[i];
            if(!hm.containsKey(key)){
                hm.put(key, 1);
            }
            else{
                hm.put(key, hm.get(key)+1);
            }
        }
        System.out.println(hm);
    }
}
