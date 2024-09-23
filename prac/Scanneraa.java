import java.util.Scanner;


public class Scanneraa{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("ENter name:");
        String name=scanner.nextLine();
        System.out.print("Hello,"+name);

        System.out.print("Enter the age:");
        int age=scanner.nextInt();
        System.out.println("You are"+age+"yrs old");

        System.out.println("Enter your height in meters:");
        double height=scanner.nextDouble();
        System.out.println("Your height is "+height+" meters");

        scanner.close();
    }
}
