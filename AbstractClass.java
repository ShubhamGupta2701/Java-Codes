abstract class abs{
    abstract int cal(int x,int y);
    void display(){
        System.out.println("this is abstract class.");
    }
}
class New extends abs{
    int cal(int a,int b){
        return a+b;
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        New n1 = new New();
        System.out.println("Sum of two numbers are : "+n1.cal(4,6));
        n1.display();
    }
}
