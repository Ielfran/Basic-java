import java.util.Scanner;
public class fourth2 {
    static Scanner userInput=new Scanner(System.in);
    public static void main(String[] args) {
           String cont="y";
           int h=1;
           while(cont.equalsIgnoreCase("Y")){
            System.out.println(h);
            System.out.println("Continue y or n? ");
            cont=userInput.nextLine();
            h++;
           }
    }
}
