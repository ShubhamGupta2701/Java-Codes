public interface Students {
    String name ="shubham";
    void study();
    void eat();
    void sleep();
}
class Student implements Students{
    public void study(){
        System.out.println("i have to study more.");
    }
    public void eat(){
        System.out.println("I have to eat too.");
    }
    public void sleep(){
        System.out.println("Sleep is also important.");
    }
}
class nam{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.eat();
        s1.sleep();
        s1.study();
    }
}