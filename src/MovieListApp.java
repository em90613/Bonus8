import java.util.Scanner;
import java.util.ArrayList;
/**
 * Created by ericm on 7/7/2017.
 */
public class MovieListApp {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput = "";
        ArrayList<Movie> movieList1 = getMovies();
        ArrayList<Movie> category;

        System.out.println("Welcome to The Movie App List");
        System.out.println();
        System.out.println("What genre of movie would you like to watch: ");
        userInput = scnr.nextLine();
        category = getSelectedMovies(userInput, movieList1);
        for (Movie title : category) {
            System.out.println(title);
        }
    }

    public static ArrayList<Movie> getMovies() {
        ArrayList<Movie> movieList1 = new ArrayList<>();
        ArrayList<Movie> category = new ArrayList<>();

        Movie moana = new Movie();//creating an instance of a Movie named moana
        moana.setMovieTitle("Moana");//sets the title of Moana to moana
        moana.setCategory("animated");//sets the genre to animated
        movieList1.add(moana);

        Movie howToTrain = new Movie();
        howToTrain.setMovieTitle("How To Train Your Dragon");
        howToTrain.setCategory("animated");
        movieList1.add(howToTrain);

        Movie cars = new Movie();
        cars.setMovieTitle("Cars");
        cars.setCategory("animated");
        movieList1.add(cars);

        Movie horribleBosses = new Movie();
        horribleBosses.setMovieTitle("Horrible Bosses");
        horribleBosses.setCategory("comedy");
        movieList1.add(horribleBosses);

        Movie bridesMaids = new Movie();
        bridesMaids.setMovieTitle("Brides Maids");
        bridesMaids.setCategory("comedy");
        movieList1.add(bridesMaids);

        Movie talladegaNights = new Movie();
        talladegaNights.setMovieTitle("Talladega Nights");
        talladegaNights.setCategory("comedy");
        movieList1.add(talladegaNights);

        Movie manchester = new Movie();
        manchester.setMovieTitle("Manchester By the Sea");
        manchester.setCategory("drama");
        movieList1.add(manchester);

        Movie goodWill = new Movie();
        goodWill.setMovieTitle("Good Will Hunting");
        goodWill.setCategory("drama");
        movieList1.add(goodWill);

        Movie theDeparted = new Movie();
        theDeparted.setMovieTitle("The Departed");
        theDeparted.setCategory("drama");
        movieList1.add(theDeparted);

        Movie halloween = new Movie();
        halloween.setMovieTitle("Halloween");
        halloween.setCategory("horror");
        movieList1.add(halloween);


        Movie conjuring = new Movie();
        conjuring.setMovieTitle("The Conjuring");
        conjuring.setCategory("horror");
        movieList1.add(conjuring);

        Movie thanksKilling = new Movie();
        thanksKilling.setMovieTitle("Thankskilling");
        thanksKilling.setCategory("horror");
        movieList1.add(thanksKilling);

        return movieList1;
    }

    public static ArrayList<Movie> getSelectedMovies ( String userInput, ArrayList<Movie> movies){
        ArrayList<Movie> selectedMovies = new ArrayList<>();
        for(Movie movie: movies){
            if (userInput.equalsIgnoreCase(movie.getCategory())){
                selectedMovies.add(movie);
            }

        }
        return selectedMovies;

    }
}


