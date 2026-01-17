import java.util.Scanner;
public class Area_Triangle {
    public static double triangle_func(int height , int base){
        return (0.5*height*base);

        
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        double area = triangle_func(10,20);
        System.out.println(area);
    }

    
}
