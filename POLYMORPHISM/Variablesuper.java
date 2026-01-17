class Mother{
    String name ="A";
}
class Daughter extends Mother{
    String name ="B";
    void display(){
        System.out.println(name);
        System.out.println(super.name);
    }
}


public class Variablesuper {
    public static void main(String[] args) {
         Daughter d = new Daughter();
         d.display();
    }
   
    
}
