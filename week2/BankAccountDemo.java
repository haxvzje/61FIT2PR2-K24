package week2;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount minhAccount = new BankAccount("Luc Van Minh", 100);
        BankAccount duongAccount = new BankAccount("Vo Phi Duong", 1000);

        System.out.println("== Init ==");
        System.out.println(minhAccount);
        System.out.println(duongAccount);

        System.out.println("== Transfer ==");
        BankAccount.transfer(minhAccount, duongAccount, 50);
        System.out.println(minhAccount);
        System.out.println(duongAccount);
    }
}
