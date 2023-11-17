package Media;

public class Movie extends AMedia {

    private String movie;
    public Movie(String movie, String name, String genre, double rating, int year) {
        super(name, genre, rating, year);
        this.movie = movie;
    }


   public String getMovie( ){

        return movie;
   }
}
