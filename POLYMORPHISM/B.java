class A{
    public void  demo(int a,int b){

       System.out.println("A is called");
    }
    public void  demo(double a,double b){
        System.out.println("B is called");
    }
    public void demo(String a){
        System.out.println("C is called");
    }
    public void demo(String a,String b){
        System.out.println("D is called");
    }
    
}
public class B{
    public static void main(String[] args) {
        A a =new A();
        a.demo('a','b');//explicit conversion
        a.demo(20.0,30.2);
        a.demo("ankita");
        a.demo("bhagya","ankita");

        
    }
}