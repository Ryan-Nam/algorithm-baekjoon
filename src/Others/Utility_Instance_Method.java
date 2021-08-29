package Others;
public class Utility_Instance_Method {
    public static void main(String[] args) {
        Test.m1(); // without object, utility method can be called.
        //Test.m2(); -> Error  // m2 is not static. so can't call, so must have object to call

        Test t = new Test();
        t.m1(); // can call with object, but not good way to call like this, Test.m1 is right way.
        t.m2();
    }
}
class Test {
    //Constructre // default, but i just want to show off.
    Test(){
    }
    // Utility method
    static void m1() {
        System.out.println("Utility Method is called!");
    }
    // Instance Method// Normal method
    void m2(){
        System.out.println("Instance Method is called!");
    }
}
