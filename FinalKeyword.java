public class FinalKeyword {
    public static void main(String[] args) {
        /* float pi = 3.14f;
        pi += 5;
        System.out.println(pi); */
        final float pi = 3.14f;
        /* pi = 4.5;  --> we can't change the value of a final variable . */
        System.out.println(pi);
    }
}
