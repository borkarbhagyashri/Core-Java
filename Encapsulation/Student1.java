import java.util.Scanner;
class Student{
    private int id;
    private String name;
    private double marathi;
    private double hindi;
    private double science;
    private double maths;
    private double history;
    private String grade;

    public int getId(){
      return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getMarathi(){
        return this.marathi;
    }
     public double getHindi(){
        return this.hindi;
    }
     public double getScience(){
        return this.science;
    }
     public double getMaths(){
        return this.maths;
    }
     public double getHistory(){
        return this.history;
    }
     public String getGrade(){
        return this.grade;
     }
    public void setId(int id){
     this.id =id;
    }
      public void setName(String name){
     this.name=name;
   }
     public void setMarathi(double marathi){
     this.marathi =marathi;
   }
     public void setHindi(double hindi){
     this.hindi=hindi;
   }
     public void setScience(double science){
     this.science =science;
   }
     public void setMaths(double maths){
     this.maths =maths;
   }
     public void setHistory(double history){
     this.history=history;
   }
   public void calculateGrade(){
     double per = calculatePercentage();
     if(per>=90 && per<=100){
        this.grade="O";
     }
     else if(per>=80 && per<90){
        this.grade="A+";
     }
     else if(per>=70 && per<80){
        this.grade="A";
     }
     else if(per>=60 && per<70){
        this.grade="B+";
     }
     else if(per>=50 && per<60){
        this.grade="B";
     }
     else if(per>=40 && per<50){
        this.grade="C";
     }
     else{
        this.grade="Fail";
     }
   }
   public double calculateTotal(){
    return(marathi+hindi+science+maths+history);
   }
   public double calculatePercentage(){
    return(calculateTotal()/5);
   }


}


public class Student1{
    public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);
    Student[] s= new Student[5];
    for(int i=0;i<5;i++){
        s[i] =  new Student();
        System.out.println("enter the id of the student");
        s[i].setId( sc.nextInt());
        sc.nextLine();
        System.out.println("enter the name of the student");
        s[i].setName(sc.nextLine());
        System.out.println("enter the marks of marathi");
        s[i].setMarathi(sc.nextDouble());
        System.out.println("enter the marks of hindi");
        s[i].setHindi(sc.nextDouble());
        System.out.println("enter the marks of science");
        s[i].setScience(sc.nextDouble());
        System.out.println("enter the marks of  maths");
         s[i].setMaths(sc.nextDouble());
        System.out.println("enter the marks of  history");
        s[i].setHistory(sc.nextDouble());
         s[i].calculateGrade();
    }


     for(int i=0;i<5;i++){
       
        
        if(s[i].getGrade().equals("A+")){
         System.out.println("id of the student:  " +  s[i].getId( ));
        
        System.out.println("name of the student:" + s[i].getName() );
        System.out.println("Grade of the student" + s[i].getGrade());

        }
        
        // System.out.println("Grade of student:" + s[i].getGrade());
       

    }

     





    }

        
    }
    

