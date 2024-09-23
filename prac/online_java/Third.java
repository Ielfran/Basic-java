import java.util.Scanner;

public class Third{
    static Scanner userinput=new Scanner(System.in);

    public static void main(String args[]){
        System.out.println("Your favourite number:");
        if(userinput.hasNextInt()){
            int numenter=userinput.nextInt();

            System.out.println("You entered "+numenter);
            int numbero=Math.abs(numenter);
            System.out.println(numbero);
            int great=Math.max(5,90);
            int small=Math.min(34,44);
            System.out.println(great+"ssdsd"+small);

            int numceil=(int)Math.ceil(4.444);
            Double numfloor=(Double)Math.floor(4.3);
            int numround=(int)Math.round(5.63);
            int numrandom=(int)(Math.random()*11);
            System.out.println(numceil+"and"+numfloor+"and"+numround+"and"+numrandom);
        }else{
            System.out.println("You have not entered!!");
        }
    }
}