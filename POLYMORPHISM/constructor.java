class Company{
    public Company(String name){
        System.out.println("parent is called");
    }
    
}
class Customer extends Company{
    public Customer(String name){
        super(name);//first should be the constructor called
        System.out.println("child is called");
    }
}


public class constructor {
    public static void main(String[] args) {
        Customer cs = new Customer("Microsoft");
        
        
           }
    
}
