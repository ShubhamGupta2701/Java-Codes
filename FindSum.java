public class FindSum {
    public static void main(String[] args) {
        int i,j=0;
        for(i=101;i<200;i++){
            if(i%2==0 || i%3==0){
                j += i;
            }
        }
        System.out.println("Sum of all integers above 100 and less then 200 is : "+j);
    }
}
