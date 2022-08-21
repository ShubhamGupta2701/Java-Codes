class phone{
    phone(){
        System.out.println("this is my phone.");
    }
    phone(String s){
        System.out.println("Name of the phone is : "+s);
    }
    phone(String s,int x){
        System.out.println("Name of the phone is : "+s);
        System.out.println("price of the phone is : "+x);
    }
}
public class ConstructorClass {
    public static void main(String[] args) {
        phone p1 = new phone();
        phone p2 = new phone("IPhone");
        phone p3 = new phone("IPhone",115000);

    }
}
