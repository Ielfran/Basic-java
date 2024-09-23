
public class fifth1 {
    static double PI=3.14159;
    public static void main(String[] args){
        addthem(12,2);
        System.out.println("GLobal "+PI);
    }

    public static int addthem(int a, int b){
        double smallpi=3.140;
        PI=PI+3;
        System.err.println("Local "+ PI);
        return 1;
    }
}
