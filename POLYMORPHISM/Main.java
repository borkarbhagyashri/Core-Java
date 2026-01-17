class Parent5 {
   public static void display() {
        System.out.println("Parent static method");
    }
}

class Child5 extends Parent5 {
   public  static void display() {
        System.out.println("Child static method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent5 p = new Child5();
        p.display(); // Calls Parent's static method (method hiding)
    }
}
