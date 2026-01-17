
class Father{
    public void getFlat(){
        System.out.println("A");
    }
    

}
class Son extends Father{
    
        public void getFlat(){
            System.out.println("B");
        }
        public void display(){
            System.out.println("C");
        }
    }


public class Method_Overiding {
    public static void main(String[] args) {
        Father F = new Father();
        F.getFlat();
        Son s1= new Son();
        s1.getFlat();                                
        Father f1 = new Son();
        f1.getFlat();
        // f1.display();//


    }
    
}
