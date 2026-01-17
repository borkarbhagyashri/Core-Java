public class Power {
    public static int power_func(int base,int exponent){
        int power = 1;
      
        while(exponent>0){
            power = power*base;
            exponent--;
            

        }
        return(power);

        
    }
    public static void main(String[] args){
        int power = power_func(2,3);
        System.out.println(power);
    }
    
}
