public class NestedIf {
    public static void main(String[] args){
        int x=10,y=20,z=15;
        if(x>y){
            if(x>z){
                System.out.println("x is greater then y and z.");
            }
            else{
                System.out.println("z is greater then x and z");
            }
        }
        else{
            if(y>z){
                System.out.println("y is greater then x and z");
            }
            else{
                System.out.println("z is greater then x and y");
            }
        }
    }
}
