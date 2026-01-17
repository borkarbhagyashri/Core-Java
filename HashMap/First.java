import java.util.HashMap;
public class First{
    public static void main(String[] args){
        HashMap<Integer , String> hm = new HashMap<>();
        hm.put(1, "Pen");
        hm.put(2, "Book");
        hm.put(3, "Notebook");
        hm.put(2, "Bottle");

        System.out.println(hm.get(1));
        System.out.println(hm.containsKey(2));

    }
}