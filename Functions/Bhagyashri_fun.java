import java.util.Scanner;
public class Bhagyashri_fun{
    public static void B_letter_func(int num,int mid){
        for(int i=1 ; i<=num ; i++){
            for(int j=1 ; j<=num ; j++){
                if(i==1 || j==1 || i==(num/2)+1 || j==num || i==num)
              
                 
                
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();

            }
            


        System.out.println("-----------------");
     }

     public static void H_letter_func(int num,int mid){
        for(int i=1 ; i<=num ; i++){
            for(int j=1 ; j<=num ; j++){
                if(i==mid || j==1 || j==num ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();

            }
        System.out.println("-----------------");

    }
    public static void A_letter_func(int num,int mid){
        for(int i=1 ; i<=num ; i++){
                for(int j=1 ; j<=num ;j++){
                    if(i<=mid && j<=mid && j==(mid-i)+1){
                        System.out.print("*");
                    }
                    else if(i<=mid && j>=mid && j==(mid+i)-1){
                        System.out.print("*");
                    }
                    else if((i==mid-1) && j!=1 && j!=num){
                        System.out.print("*");
                    }
                    
                    
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println("-----------------");

    }
    
    public static void G_letter_func(int num,int mid){
        for(int i=1 ; i<=num ; i++){
            for(int j=1 ; j<=num ; j++){
                if(i==1 || j==1 || i==num ){
                    System.out.print("*");
                }
                else if((j==num && i>=mid+1)){
                    System.out.print("*");
                }
                else if((i==mid && j>=mid)){
                    System.out.print("*");
                }
                
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------");
        

    }
    public static void Y_letter_func(int num , int mid){
        for(int i=1 ; i<=num ; i++){
                for(int j=1 ; j<=num ;j++){
                    if(i<=mid && j==(num-i)+1){
                        System.out.print("*");
                    }
                    else if(j<=mid && j==i){
                        System.out.print("*");
                    }
                    else if(j==mid && i>=mid){
                        System.out.println("*");
                    }
    
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        
            System.out.println("-------------");


    }
    public static void S_letter_func(int num,int mid){
        for(int i=1 ; i<=num ; i++){
                for(int j=1 ; j<=num ;j++){
                    if(j==mid && j>=mid && i<=mid || i==1 && j>=mid || i==num && j>=mid){
                        System.out.print(" * ");
                    }
                    else if(i==mid && j>=mid || j==num && i>=mid){
                        System.out.print(" * ");
                    }
    
                    else{
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        
            System.out.println("-------------");


    
    }
    public static void R_letter_func(int num,int mid){
        for(int i=1 ; i<=num ; i++){
            for(int j=1 ; j<=num ; j++){
                if(i==1 || j==1 || i==mid+1 || j==num && i<=mid+1){
                    System.out.print("*");
                }
                else if(i>=mid && j==(i-mid)+1){
                    System.out.print("*");
                }
                
                
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------");
    }
    public static void I_letter_func(int num,int mid){
        for(int i=1 ; i<=num ; i++){
            for(int j=1 ; j<=num ; j++){
                if(j==mid || i==1|| i==num ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();

            }
            System.out.println("-------------");

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int mid = (num/2)+1;
        B_letter_func(num,mid);
        H_letter_func(num,mid);
        A_letter_func(num,mid);
        G_letter_func(num, mid);
        Y_letter_func(num, mid);
        A_letter_func(num,mid);
        S_letter_func(num, mid);
        H_letter_func(num,mid);
        R_letter_func(num,mid);
        I_letter_func(num,mid);




    

}

}