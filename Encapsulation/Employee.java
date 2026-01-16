class Employee1{
    private int id;
    private String name;

public  Employee1(int id,String name){
    this.id=id;
    this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

}

public class Employee {
    public static void main(String[] args) {
        Employee1 E = new Employee1(1,"ankita");
        System.out.println("ID:"+ E.getId() +" Name:" + E.getName());

    }
   

    
}
