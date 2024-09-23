import java.util.Scanner;
//make a guessing game
public class fifth3 {
    static int random;
    static Scanner userinput=new Scanner(System.in);
    public static void main(String[] main){
        System.out.println(getrandom());
    }
    public static int getrandom(){
        random=(int)(Math.random()*33);
        return random;
    }
}
