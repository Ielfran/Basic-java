import java.util.Scanner;

class SimpleDotCom{
    private int[] locationCells;
    private int numOfHits=0;

    public void setLocationCells(int[] locs){
        locationCells=locs;
    }

    public String checkYourself(String userGuess){
        int guess=Integer.parseInt(userGuess);
        String result="miss";

        for(int cell: locationCells){
            if(guess==cell){
                result="hit";
                numOfHits++;
                break;
            }
        }
        if(numOfHits==locationCells.length){
            result="kill";
        }
        System.out.println(result);
        return result;
    }
}


public class SimpleDotComGame{
    public static void main(String[] args){
        SimpleDotCom dot=new SimpleDotCom();
        int numOfGuesses=0;

        int startLocation=(int)(Math.random()*5);
        int[] locations={startLocation,startLocation+1,startLocation+2};
        dot.setLocationCells(locations);

        boolean isAlive=true;
        Scanner scanner=new Scanner(System.in);

        while(isAlive){
            System.out.println("Enter a guess(0-6): ");
            String userGuess=scanner.nextLine();
            numOfGuesses++;

            String result=dot.checkYourself(userGuess);
            if(result.equals("kill")){
                isAlive=false;
                System.out.println("You took "+numOfGuesses+" guesses.");
            }
        }
        scanner.close();
    }

}
