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


public class StudentInfo {
    public static void main(String[] args){
        Student s = new Student();
        s.setId(10);
        s.setName("Bhagya");
        s.setMarathi(95.0);
        s.setHindi(94.0);
        s.setEnglish(90);
        s.setMaths(30.3);
        s.setScience(85.9);
        int id = s.getId();
        String name = s.getName();
        s.calculateGrade();
        String grade = s.getGrade();
        System.out.println("id:"+id + " name:"+name + " grade:"+grade);

        Student s2 = new Student();
        s2.setId(11);
        s2.setName("Yashraj");
        s2.setMarathi(92);
        s2.setHindi(91);
        s2.setEnglish(94.8);
        s2.setMaths(99);
        s2.setScience(98);
        int id1 = s2.getId();
        String name1 = s2.getName();
        s2.calculateGrade();
        String grade1 = s2.getGrade();
        System.out.println("id:"+id1 + " name:"+name1 + " grade:"+grade1);
       
    }
}
