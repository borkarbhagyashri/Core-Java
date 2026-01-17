import java.util.Scanner;
public class Factorial {
    public static int  display(int num  ,int fact ){
        if(num==0){
            return fact;
        }
      
       fact = fact * num;
       num = num -1;
      return display(num, fact);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        
        int f=display(num, 1);
        System.out.println(f);

    }
    
}

// import java.util.Scanner;
// public class Factorial {
//     public static int  display(int num  ){
//    if(num ==0 || num ==1) {
//      return 1;
//    }
//       return num * display(num-1);


//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int num = sc.nextInt();
        
//         int fact=display(num);
//         System.out.println(fact);

//     }
    
// }


