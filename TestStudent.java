
public class TestStudent{
    public static void main(String[] args) {

        Student s1 = new Student("Karam Ziouchi" , 23 , 19) ;
        System.out.println(s1.toString());

        if(s1.isPassed()){
            System.out.println("Decision: Pass");
        }else{
            System.out.println("Decision: Fail...!");
        }

    }
}