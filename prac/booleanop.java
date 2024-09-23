import java.util.*;

public class booleanop {
    public static void main(String[] args) throws Exception {
        String s = "true Tresfvsd false Gis another";

        Scanner scanner = new Scanner(s);
        while(scanner.hasNext()){
            if(scanner.hasNextBoolean()){
                System.out.println("Found Boolean value: " + scanner.nextBoolean());
            } else {
                System.out.println("Not found Boolean() value: " + scanner.next());
            }
        }
        scanner.close();
    }
}

