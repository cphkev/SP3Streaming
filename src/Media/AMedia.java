package Media;

public abstract class AMedia {

private String genre;
private double rating;

private int year;

String name;



    public AMedia(String name,String genre, double rating, int year) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.rating = rating;

    }
//Sut min tissemand mange gange

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }
}

