public class ConditionalOperators {
    public static void main(String[] args){
        int a = 10,b=20,c=2;
        if(a>=b && a>=c){
            System.out.println("a is greatest among three.");
        } else if (b>=a && b>=c) {
            System.out.println("b is greatest among three.");
        }
        else{
            System.out.println("c is greatest among three.");
        }
    }
}
