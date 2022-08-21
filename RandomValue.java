import java.util.Random;
public class RandomValue {
    public static void main(String[] args) {
        Random random = new Random();
//        int x = random.nextInt(); // if we use only this statement then we get values quite high therefor we have to limit it.
        int x =random.nextInt(10)+6; // this will start from 6 to 10 numbers higher , and fetch a value randomly.
        System.out.println(x);

        double y = random.nextDouble()+1.3; // double will get us a value between 0 and 1.
        System.out.println(y);
    }
}
