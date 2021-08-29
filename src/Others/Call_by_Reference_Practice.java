package Others;

public class Call_by_Reference_Practice {
    public static void main(String[] args) {
        // primitive
        int money1 = 10000; // 10000 is actually stored in the int variable memory
        System.out.printf(money1 + " -> ");
        zero(money1); // method zero,  10000 will be passed to the method zeoro as int d
        // so this money 1 is primitive types variable
        System.out.println(money1);


        // Reference
        Money money2 = new Money(10000);
        System.out.printf(money2 + " -> ");
        zero(money2); // so money2 is reference types variable -> so execute zero method below
        System.out.println(money2.getWon());
    }

    public static void zero(int d) { // money 1 will be copied
        d = 0;  // So d is 0, which means NOT "MONEY1" IS BECOME 0.
    }
   /* public static int zero(int d) { // money 1 will be copied
        return d = 0;  // So d is 0, which means NOT "MONEY1" IS BECOME 0.
    }*/

    public static void zero(Money m) { // Money m = the addrest of "1000"(ex)#2000-address)
        m.won = 0;
    }
}

class Money {
    int won;

    Money(int w) {
        won = w;
    }

    public int getWon(){
        return won;
    }

}
