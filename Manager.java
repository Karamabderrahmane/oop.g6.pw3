public class Manager extends Employee{


    private double bonus ;

    Manager(String name, double salary , double bonus) {
        super(name, salary);
        this.bonus = bonus ;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getTotalSalary(){
        return getSalary() + getBonus() ;
    }

    @Override
    public String toString(){
        return "Manager's Bonus: " + getBonus() + " DZ\nManager's TotalSalary: " + getTotalSalary() + " DZ\n" ;
    }

}
