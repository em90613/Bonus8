import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ericm on 7/7/2017.
 */
public class Movie {
    private String movieTitle;
    private String category;

    public Movie(){//This is a blank constructor. If you don't set the parameters to be passed, Java will set default parameters.

    }
//    public Movie(String movieTitle, String category){
//        this.movieTitle = movieTitle;
//        this.category = category;
//    }
    public String toString() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {//allows me to set the title of an Instance of Movie in the main. Ex: Movie moana would
        this.movieTitle = movieTitle;               //be initialized to "Moana".
    }

    public String getCategory() {//allows me to pull the genre of an Instance of Movie
        return category;
    }

    public void setCategory(String category) {//allows me to set the genre of and Instance of Movie. Ex: Movie moana would be "animated".
        this.category = category;
    }

}
