public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] name = {"shubham", "Aastha", "triom","vedika","isha","prachi","vanshika","vaishali","vaishnavi"};
        for(String n:name){
            System.out.println(n);
        }
        int x = name.length;
        System.out.println("Total number of names are : "+x);
    }
}
