public class D {
    public static void main(String[] args){
        int a=0;
        while(a<5){
            if(a==3){
                if(a<6){
                    System.out.println(a);
                    a--;
                }
                if(a<7){
                    break;
                }
            }
             System.out.println(a);
        a++;
        }
       
    }
    
}
