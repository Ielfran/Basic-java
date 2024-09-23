public class First{
    public static void main(String[] args){
        Double randomnumber=(Double)(Math.random() *50);

        if(randomnumber<25){
            System.out.println("Less than 25");
        }
        System.out.println("The random number is "+randomnumber);
    }
}