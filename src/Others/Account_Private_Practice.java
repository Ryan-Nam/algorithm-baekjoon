package Others;

public class Account_Private_Practice {
    public static void main(String[] args) {
        Account myAccount = new Account(65000);

        User.deposit(myAccount, 5000);
        User.check(myAccount);
    }
}

class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    // Getter method
    public int getBalance() {
        return balance; // == this.balance
    }

    public void setBalance(int balance) {
        this.balance = balance; // -> field
    }

    /*
    public String toString() {
        return "Account [balance=" + balance + "]";
    }*/
}

class User {
    public static void check(Account account) {
        System.out.printf("Current balance: $ %d\n", account.getBalance());
    }

    public static void deposit(Account account, int amount) {
        /*account.balance += amount;*/ // cann access directly
        int bal = account.getBalance();
        account.setBalance(bal + amount);
    }
}
/*
class Hacker {
    public static void malcious (Account account) {
        //account.balance = 0;
        System.out.println("You are hacked! HAHAHAHAHAHAHAHAH");
    }
}*/
