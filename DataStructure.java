import java.util.*;
public class DataStructure {
    public static void main(String[] args) {
       /* ArrayList data = new ArrayList(); // ArrayList
        data.add(15);
        data.add("shubham");
        data.add(1,true);
        data.add(0,"Nora");
        System.out.println(data.get(0));
        System.out.println(data.size());
        System.out.println("Element in list are : "+data); */
        /*LinkedList data = new LinkedList(); // Linked list
        data.add(15);
        data.add("shubham");
        data.add(1,true);
        data.add(0,"Nora");
        System.out.println(data.get(0));
        System.out.println(data.size());
        System.out.println("Element in list are : "+data); */
        /*HashSet data = new HashSet(); // Hashset --> can't have any index and is unordered.
        data.add(15);
        data.add("shubham");
        data.add(true);
        data.add("Nora");
        System.out.println(data.size());
        System.out.println("Element in list are : "+data);*/
        HashMap data = new HashMap();
        data.put(1,1);
        data.put(2,4);
        data.put(3,9);
        data.put(4,16);
        data.put(5,25);
        System.out.println(data.containsValue(16));
        System.out.println("Values : "+data);
    }
}
