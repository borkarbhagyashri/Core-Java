import java.util.Scanner;

public class PatternK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int num;
        System.out.println("Enter thr number");
        num = sc.nextInt();
        int mid =(num/2)+1;
        for (i=1 ; i<=num ; i++) {
            for (j=1 ; j<=num ; j++) {
                if (j==1) {
                    System.out.print("*");  

                } else if (i<=mid && j==(mid-i+1)) {
                    System.out.print("*");  
                } else if (i>=mid && j==(i-mid+1)) {
                    System.out.print("*"); 
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
