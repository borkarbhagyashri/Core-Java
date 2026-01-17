class Animal{
    public void Cat(){
        System.out.println("Parant Class");
    }
}

class Dog extends Animal{

}

class Elephant extends Animal{
    
}
public class HierarchicalInheritance {
    public static void main(String[] args){
        // Dog D = new Dog();
        // D.Cat();
        Elephant E = new Elephant();
        E.Cat();
    }
}
