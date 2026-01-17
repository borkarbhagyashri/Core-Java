class Child{
    public int add(int a,int b){
        System.out.println("Child class");
      int c=a+b;
       return c;
    }
    public float add(float a,float b){
        System.out.println("CHILD CLASS");
    float d= a+b;
        return d;

    }

}



public class Parent {
 public static void main(String[] args) {
     Child ch = new Child();
    int c= ch.add(10,30);
    float d = ch.add(14f,26f);
    System.out.println("the addition of 1 function: "+c);
    System.out.println("the addition of 2 function: "+d);
     
 }
    
}
