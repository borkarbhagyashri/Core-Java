import java.util.Scanner;
class Student{
    private  int id;
    private String name;
    private double marathi;
    private double hindi;
    private double english;
    private double maths;
    private double science;
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
    public double getEnglish(){
        return this.english;
    }
    public double getmaths(){
        return this.maths;
    }
    public double getScience(){
        return this.science;
    }
    public String getGrade(){
        return this.grade;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMarathi(double marathi){
        this.marathi = marathi;
    }
    public void setHindi(double hindi){
        this.hindi = hindi;
    }
    public void setEnglish(double english){
        this.english= english;
    }
    public void setMaths(double maths){
        this.maths = maths;
    }
    public void setScience(double science){
        this.science = science;
    }

    public void calculateGrade(){
        double per = calculatePercentage();
        if(per>=90 && per<100){
            this.grade = "O";
        }
        else if(per>=80 && per<90){
            this.grade = "A+";
        }
        else if(per>=70 && per<80){
            this.grade = "A";
        }
        else if(per>=60 && per<70){
            this.grade = "B+";
        }
        else if(per>=50 && per<60){
            this.grade = "B";
        }
        else if(per>=40 && per<50){
            this.grade = "C";
        }
        else{
            this.grade = "Fail";
        }
    }
    public double calculateTotal(){
        return(marathi+hindi+english+maths+science);
    }
    public double calculatePercentage(){
        return(calculateTotal()/5);
    }
}

public class Student2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student [] s = new Student[5];

        for(int i=0 ; i<5 ; i++){
            s[i] = new Student();
            System.out.println("entre the ID of the Student:");
            s[i].setId(sc.nextInt());
            sc.nextLine();
            System.out.println("entre the Name of the Student:");
            s[i].setName(sc.nextLine());
            System.out.println("enter the marks of the Marathi:");
            s[i].setMarathi(sc.nextDouble());
            System.out.println("enter the marks of the Hindi:");
            s[i].setHindi(sc.nextDouble());
            System.out.println("enter the marks of the English:");
            s[i].setEnglish(sc.nextDouble());
            System.out.println("enter the marks of the Science:");
            s[i].setScience(sc.nextDouble());
            System.out.println("enter the marks of the Maths:");
            s[i].setMaths(sc.nextDouble());
            s[i].calculateGrade();
        }

        for(int i=0 ; i<5 ; i++){
            if(s[i].getGrade().equals("A+")){
                System.out.print("ID of the Student:" + s[i].getId());
                System.out.println("name of the student:" + s[i].getName() );
                System.out.println("Grade of the student" + s[i].getGrade());
            }
        }

    }
    
}
