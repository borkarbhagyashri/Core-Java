class Principal{
    public void getData(){
        System.out.println("Get Some Data");
    }
}

class HOD extends Principal{

}

public class MultilevelInheritance {
    public static void main(String[] args){
        HOD H = new HOD();
        H.getData();
    }
}
