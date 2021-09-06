package Interface_Practice;

public class Interface_sout_prac {
    public static void main(String[] args) {
        // Make Ryan object
        Ryan nam = new Ryan("HyunwooNam");

        // Change to Developer
        Developer devNam = nam;
        devNam.programming("Java");

        // Change to Tutor
        Tutor teacherRyan = nam;
        teacherRyan.teach("Algorithm");

        Barista coffeRyan = nam;
        coffeRyan.extractCoffee();

    }
}

interface Developer {
    public void programming(String lang);
}

interface Tutor {
    public void teach(String subject);
}

interface Barista {
    public void extractCoffee();
}

class Ryan implements Developer, Tutor, Barista {
    private String name;

    public Ryan(String name) {
        this.name = name;
    }

    public void programming(String lang){
        System.out.printf("%s -> %s ing\n", this.name, lang);
    }
    public void teach(String subject){
        System.out.printf("%s -> %s ing\n", this.name, subject);
    }
    public void extractCoffee(){
        System.out.printf("%s -> Making coffee ing\n", this.name);
    }
}