public class First {
    public static void main(String[] args) {
        String s1 = new String("Bright Path");
        String s2 = new String("Bright Path");
        String s3 = "Bright Path";
        String s4 = "Bright Path";
        String s5 = "Bright" + " Path";
        String s6 = "Bright";

        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s1==s5);
        System.out.println(s4==s5);
        


    }
    
}
