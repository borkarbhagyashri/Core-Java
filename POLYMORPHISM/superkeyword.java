class Teacher{
    public void display(){
    System.out.println("inside teacher class");
    }
    
}
class Student extends Teacher{
    public void  getBook(){
        // super.display();
        System.out.println("inside the child class");
         super.display();
    }

}
public class superkeyword {
    public static void main(String[] args) {
        Student s = new Student();
        s.getBook();
    }
    
}
