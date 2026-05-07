public class BankAccount {

    private String ownerName ;
    private double balance ;

    BankAccount(String ownerName , double balance){
        this.ownerName = ownerName ;
        this.balance = balance ;
    }

    public double deposit(double amount){
       return balance + amount ;
    }

    public double withdraw(double amount){
        if(balance > 0 && balance >= amount){
            balance = balance - amount ;
        }
        return balance ;
    }

    public double getBalance(){
        return balance ;
    }

    public String getOwnerName(){
        return ownerName ;
    }

    @Override
    public String toString(){
        return "OwnerName: "+getOwnerName()+"\nBalance: "+getBalance()+" DZ\n" ;
    }

    public void setOwnerName(String name){
        ownerName = name ;
    }

    public void setBalance(double balance){
        this.balance = balance ;
    }



}
