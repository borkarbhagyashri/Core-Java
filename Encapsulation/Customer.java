import java.util.Scanner;
class Customer1 {
    private int id;
    private String name;

    public Customer1(int id , String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    
}

public class Customer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Customer1[] c = new Customer1[5];

        for(int i=0 ; i<5 ; i++){
       
        System.out.println("enter the id of customer:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("enter the name of the customer:");
        String name= sc.nextLine();
        c[i] = new Customer1(id, name);

        }
        for(int i=0;i<5;i++){
            System.out.println("the id of the customer:"+ c[i].getId());
            System.out.println("the name of the customer:"+c[i].getName());
        }
    }
}
 