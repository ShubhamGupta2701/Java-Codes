class student{
    String name = "Shubham Gupta";
    public void show(){ //here if i use static keyword then i didn't need to create a instance , for use this member function i use classname.memberfunction.
        System.out.println("name of the student is : "+name);
    }
}

public class UserDefinedClass {
    public static void main(String[] args) {
        student n1 = new student();
        n1.show();
    }
}
