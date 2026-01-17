 class Parents{
    public void getCar(){
        System.out.println("parent class is called");
    }
}
//single inheritance
 class Child1 extends Parents{
    // public void getCar(){
    //     System.out.println("child class is called");
    // }
    

}
//multilevel inheritance
class Subchild extends Child1{

}


public class Single_inheritance {
    public static void main(String[] args) {
        Subchild ch = new Subchild();
         ch.getCar();
        
    }
   

    
}
