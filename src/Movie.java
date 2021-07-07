public class Movie {
    private String title;
    private int year;
    private String director;
    private double rating;

    public Movie() {
    }

    public Movie(String title, int year, String director, double rating) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }
    void printinfo(){
        System.out.println(this.title);
        System.out.println(this.year);
        System.out.println(this.director);
    }
    void printrating(){
        System.out.println(this.rating);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
