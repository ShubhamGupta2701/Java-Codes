class teach{
    void physics(){
        System.out.println("this is scientific subject.");
    }
}
public class AnonymsClass {
    public static void main(String[] args) {
        teach t1 = new teach(){
            @Override
            void physics() {
                System.out.println("Actually it  is a mathematical subject.");
            }
        };
        t1.physics();
    }
}
