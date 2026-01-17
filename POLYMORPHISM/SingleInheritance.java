class Friends{
    void Ankita(){
        System.out.println("Parant Class");
    }
}

class Bhagya extends Friends{

}

public class SingleInheritance {
    public static void main(String[] args) {
        Bhagya B = new Bhagya();
        B.Ankita();
    }
    
}
