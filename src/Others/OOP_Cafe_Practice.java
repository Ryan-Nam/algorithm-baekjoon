package Others;

public class OOP_Cafe_Practice {
    public static void main(String[] args) {

        Coffee c1 = new Coffee();
        c1.name = "Latte";
        c1.price = 3.8;
        System.out.println(c1.info());


        Coffee c2 = new Coffee();
        c2.name = "Chailatte";
        c2.price = 4.5;
        System.out.println(c2.info());


        Coffee c3 = new Coffee();
        c3.name = "Cappucino";
        c3.price = 4.8;
        System.out.println(c3.info());

    }
}

class Coffee {
    String name;
    double price;
    String info(){
        return String.format("%s coffee: $%.2f", name, price);
     }
}
