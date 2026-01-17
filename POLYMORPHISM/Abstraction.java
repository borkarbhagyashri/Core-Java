abstract class Teachers{
    abstract void getWork();
}

class MukeshSir extends Teachers{
    void getWork(){
        String name = "Bhagya";
        int Id = 101;

        System.out.println(name);
        System.out.println(Id);
        
        
    }
}
public class Abstraction {
    public static void main(String[] args){
        MukeshSir M = new MukeshSir();
        M.getWork();
    }
    
}
