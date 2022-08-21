public class ErrorHandling {
    public static void main(String[] args) {
        int a=10,b=0;
        try{
            System.out.println(a/b);
        }
        catch (Exception c){
            System.out.println("can't do a/b");
        }
        finally {
            System.out.println("Do your best.!!!!.");
        }
        System.out.println("hi, my name is shubham");
    }
}
