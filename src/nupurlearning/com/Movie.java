package nupurlearning.com;

public class Movie {
    String name;
    String genre;
    float rating;


    public Movie(String movieName, String movieGenre,float movieRating)
    {
        name = movieName;
        genre =movieGenre;
        rating = movieRating;


    }
    public void showDetails()
    {
        System.out.println("movie details");
        System.out.println("Name of the movie: "+name);
        System.out.println("Genre: "+genre);
        System.out.println("Public Rating: "+rating);
    }

    public static void main(String[] args)
    {
        Movie m1 = new Movie("kaal","Horror",4);
        Movie m2 = new Movie("Parineeta","Drama",3.5f);

        m1.showDetails();
        m2.showDetails();
    }
}

