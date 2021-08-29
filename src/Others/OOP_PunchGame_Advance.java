package Others;
/* make a punch game,
*
* Requirement
* Heor have features
* 1. name,
* 2. hp
*
* using punch, can damage to other hero*/
public class OOP_PunchGame_Advance {
    public static void main(String[] args) throws InterruptedException {
        // Two Hero object
        Heroo h_arthas = new Heroo ("arthas");
        Heroo h_leona = new Heroo("Leona");

        Heroo.battle(h_arthas, h_leona);
    }
}

class Heroo{
    String name;
    int hp = 100;
    Heroo(String name) {
        this.name = name;
    }

    void punch(Heroo enemy) {
        enemy.hp -= 10;
        System.out.printf("[%s] punch!\n", this.name);
        System.out.printf("\t%s HP: %d!\n", enemy.name, enemy.hp);
    }

    //Utility method
    static void battle(Heroo a, Heroo b) throws InterruptedException {
        while (a.hp > 0 && b.hp>0) {
            Heroo attacker, defender;
            if (Math.random() < 0.5) { // 0.000000 ~ 0.999999999 => 50%
                attacker = a;
                defender = b;
            } else {
                attacker = b;
                defender = a;
            }

            attacker.punch(defender);
            Thread.sleep(300);
        }
    }
}