package Interface_Practice;

/*
* Developers Nam -> We are friends!
* Doctor Kim    -> We are friends!
* Lawyer Park   -> We are friends!
* Vet Woo       -> We are friends!
* */
public class We_Are_Friends {

    /*Friends person = new Friends("We are friends");*/
    // Object
    public static void main(String[] args) {
        Developers nam = new Developers("Developers Nam");
        Doctor kim = new Doctor("Doctor Kim");
        Lawyer park = new Lawyer("Lawyer Park");
        Vet woo = new Vet("Vet Woo");

        // Grouping
        Friend[] friends = {nam, kim, park, woo};
        for (Friend f : friends) {
            f.dearFriend();
        }
    }
}

interface Friend {
    public void dearFriend();
}

class Developers implements Friend{
    private String name;
    public Developers(String name) {
        this.name = name;
    }

    //prototype method (Overriding)
    public void dearFriend(){
        System.out.printf("%s -> We are friends!\n", name);
    }

}

class Doctor implements Friend{
    private String name;
    public Doctor(String name) {
        this.name = name;
    }
    public void dearFriend(){
        System.out.printf("%s -> We are friends!\n", name);
    }
}
class Lawyer implements Friend{
    private String name;
    public Lawyer(String name) {
        this.name = name;
    }
    public void dearFriend(){
        System.out.printf("%s -> We are friends!\n", name);
    }
}
class Vet implements Friend{
    private String name;
    public Vet(String name) {
        this.name = name;
    }
    public void dearFriend(){
        System.out.printf("%s -> We are friends!\n", name);
    }
}
