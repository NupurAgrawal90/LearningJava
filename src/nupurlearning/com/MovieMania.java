package nupurlearning.com;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MovieMania {

    String movieName;
    String movieGenre;
    float movieRating;
    double profit;
    double budget;

    public MovieMania(String mName,String mGenre, float mRating)
    {
        movieName = mName;
        movieGenre = mGenre;
        movieRating = mRating;

    }
    public MovieMania(String mName,int mBudget)
    {
        movieName = mName;
        budget = mBudget;

    }




    public void showDetails()
    {
        System.out.println("movie details");
        System.out.println("Name of the movie: "+movieName);
        System.out.println("Genre: "+movieGenre);
        System.out.println("Public Rating: "+movieRating);
        System.out.println("Movie Budget: "+budget);
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the movie name");
        String mName = sc.next();
        System.out.println("Enter the Genre");
        String mGenre = sc.next();
        System.out.println("Enter the Rating");
        float mRating = sc.nextFloat();
        System.out.println("Enter Budget");
        int mBudget = sc.nextInt();
        MovieMania m1 = new MovieMania(mName,mGenre,mRating);
        System.out.println("");
        MovieMania m2 = new MovieMania(mName,mBudget);
        m1.showDetails();
        System.out.println("");
        m2.showDetails();




    }
}
