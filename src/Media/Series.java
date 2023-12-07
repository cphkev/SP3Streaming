package Media;

public class Series extends AMedia {

    private String season;
    public Series(String name, String genre, double rating, int year,String season) {
        super(name, genre, rating, year)
        this.season = season;
    }


}
