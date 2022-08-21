class practice{
    int size;
    String color;
    void setColor(String c){
        this.color = c;
    }
    void setSize(int n){
        this.size = n;
    }
    String getColor(){
        return color;
    }
    int getSize(){
        return size;
    }
}
public class GetterAndSetter {
    public static void main(String[] args) {
        practice p1 = new practice();
        practice p2 = new practice();
        p1.setColor("Red");
        p2.setColor("Blue");
        p1.setSize(12);
        p2.setSize(10);
        System.out.println(p1.getColor());
        System.out.println(p1.getSize());
        System.out.println(p2.getColor());
        System.out.println(p2.getSize());
    }
}
