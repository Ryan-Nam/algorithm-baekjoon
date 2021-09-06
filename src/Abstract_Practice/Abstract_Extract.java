package Abstract_Practice;

public class Abstract_Extract {
    public static void main(String[] args) {
        Juice j = new Juice();
        Coffee c = new Coffee();
        Beer b = new Beer();
        Water w = new Water ();
        Tea t = new Tea();
        
        // Grouping by Abstract Class
        Drink[] drinks = {j, c, b, w, t};
        
        // Groupped object, print
        for (Drink d : drinks) {
            d.ordered();
        }
    }
}

abstract class Drink {
    String name;
    double price;
    public void ordered(){
        System.out.println("Order is completed");
    }
}

class Juice extends Drink { }
class Coffee extends Drink { }
class Beer extends Drink { }
class Water extends Drink { }
class Tea extends Drink { }