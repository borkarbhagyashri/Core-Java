import java.util.Scanner;
public class AreaRectangle {
    public static double area_func(int height , int base){
        return(height*base);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        double area = area_func(10,20);
        System.out.println(area);
    
 
    }
    
}
