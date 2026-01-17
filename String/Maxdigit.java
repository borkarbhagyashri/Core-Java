public class Maxdigit {
    public static void main(String[] args) {
        String s = "Bright Path";
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)>firstMax){
                secondMax = firstMax;
                firstMax = s.charAt(i);
            }
            else if(s.charAt(i)>secondMax && s.charAt(i)<firstMax){
                secondMax = firstMax;
            }

        }
        System.out.println((char)secondMax);

        
    }
    
}
