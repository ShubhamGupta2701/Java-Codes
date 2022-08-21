class person{
    String name = "Shubham";
    void age() {
        System.out.println("Age is just a number . ");
    }
}
class kid extends person{
    void age(){
        System.out.println("I am just a kid of 8 years old.");
    }
}
class teen extends person{
    void age(){
        System.out.println("I am a teenager of 18 years old.");
    }
    void show(){
        System.out.println("Name of the student is : "+super.name); // super keyword is used to access parent class data.
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        kid k1 = new kid();
        k1.age();
        teen t1 = new teen();
        t1.age();
        person p1 = new person();
        p1.age();
        t1.show();
    }
}
