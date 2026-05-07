
public class TestBanckAccount {
    public static void main(String[] args) {
        BankAccount owner1 = new BankAccount("Karam Ziouchi" , 50000) ;

        owner1.setBalance(owner1.deposit(5000));

        System.out.println(owner1.toString());

        owner1.setBalance(owner1.withdraw(2000));

        System.out.println(owner1.toString());

    }
}