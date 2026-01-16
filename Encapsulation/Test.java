class Test1{
    private int id;
    private String name;

    public int getId(){
        return this.getId();
    }
    public String getName(){
        return this.getName();
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    } 
}


public class Test {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.setId(10);
        t.setName("ABC");
        int id = t.getId();
        String name = t.getName();
        System.out.println(id);
        System.out.println(name);
    }
    
}
