public class Student extends Person{

    private double grade ;

    Student(String name, int age ,double grade) {
        super(name, age);
        this.grade = grade ;
    }

    public double getGrade(){
        return grade ;
    }

    public void setGrade(double grade){
        this.grade = grade ;
    }

    public boolean isPassed(){
        if(grade >= 10){
            return true ;
        }else return false ;
    }

    @Override
    public String toString(){
        return "Student's Name: " + getName() + "\nStudent's Age: " + getAge() + "\nStudent's Grade: " + getGrade() ;
    }

}
