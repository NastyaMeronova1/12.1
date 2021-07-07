public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("1", 2008, "1",9.0);
        Movie movie2 = new Movie("2", 2009, "2",9.1);
        Movie movie3 = new Movie();
        movie3.setTitle("3");
        movie3.setYear(2010);
        movie3.setDirector("3");
        movie3.setRating(8.4);
        Movie movie4 = new Movie();
        movie4.setTitle("4");
        movie4.setYear(2011);
        movie4.setDirector("4");
        movie4.setRating(8.7);

        movie1.printinfo();
        movie1.printrating();
        movie2.printinfo();
        movie2.printrating();
        movie3.printinfo();
        movie3.printrating();
        movie4.printinfo();
        movie4.printrating();
    }
}
