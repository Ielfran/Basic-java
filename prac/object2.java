class Movie{
    String title;
    String genre;
    int rating;

    void playIT(){
        System.out.println("PLaying the movie");
    }
}

public class object2{
    public static void main(String[] args){
        Movie one=new Movie();
        one.title="Jurassic Park";
        one.genre="Fantasy";
        one.rating=3;
        Movie two=new Movie();
        two.title="JAWS";
        two.genre="Horror";
        two.rating=5;
        two.playIT();
    }
}
