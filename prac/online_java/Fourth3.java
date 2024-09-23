public class Fourth3 {
    public static void main(String[] args) {
        double mypi=4.0;
        double j=3.0;

        while(j<1000){
            mypi=mypi-(4/j)+(4/(j+2));
            j+=4;
            System.out.println("The approximated value of pi is "+mypi); 
        }
        System.out.println("Value of pi is: "+Math.PI);
    }
}
