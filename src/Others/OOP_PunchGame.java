package Others;

public class OOP_PunchGame {
    public static void main(String[] args) {
        // constructor
        Hero k = new Hero("Kirisi", 30);
        Hero g = new Hero("Garen", 30);

        k.punch(g);
        g.punch(k);
        g.punch(k);
        k.punch(g);
        g.punch(k);
        k.punch(g);

    }
}


class Hero {
    // Class's field
    String name;
    int hp;

    // Constrctor
    Hero (String _name, int _hp) {
        name = _name;
        hp = _hp;
    }

    // Class's method
    void punch(Hero enemy){
        enemy.hp -= 10;
        System.out.printf("[%s] punch!\n", name);
        System.out.printf("\t%s HP: %d!\n", enemy.name, enemy.hp);
    }



}
