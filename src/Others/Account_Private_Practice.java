package Others;

public class Account_Private_Practice {
    public static void main(String[] args) {
        Account myAccount = new Account(65000);
        System.out.println(myAccount);
        Hacker.malcious(myAccount);
        System.out.println(myAccount);
    }
}

class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Account [balance=" + balance + "]";
    }
}

class Hacker {
    public static void malcious (Account account) {
        //account.balance = 0;
        System.out.println("You are hacked! HAHAHAHAHAHAHAHAH");
    }
}
