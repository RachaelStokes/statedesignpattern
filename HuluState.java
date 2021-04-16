/**
 * HuluState implements the State interface and writes the methods to be specific for a HuluState
 * @author Rachael Stokes
 */
public class HuluState implements State {
    private TV tv; //instance of a tv used to change state based on current state
    private String[] movies = {"Wedding Crashers", "The Greatest Showman", "The Breakfast Club", "The Other Guys", "Crazy Rich Asians"}; //list of movies that the hulu state contains
    private String[] tvShows = {"Modern Family", "Scream Queens", "One Tree Hill", "Teen Wolf", "Dance Moms"}; //list of tv shows that the hulu state contains

    /**
     * constructor method sets the tv to the tv parameter
     * @param tv instance of tv to use in this class
     */
    public HuluState(TV tv) {
		this.tv = tv;
    }

    /**
     * prints that the home screen is loading and sets the state to the home state
     */
    @Override
    public void pressHomeButton() {
        System.out.println("\nLoading the Home Screen...\n");
        tv.setState(tv.getHomeState());
    }

    /**
     * prints that netflix is loading and sets the state to the netflix state
     */
    @Override
    public void pressNetflixButton() {
        System.out.println("\nLoading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    /**
     * prints that we are already in hulu
     */
    @Override
    public void pressHuluButton() {
        System.out.println("We are already in Hulu.");
    }

    /**
     * prints the list of 5 hulu movies
     */
    @Override
    public void pressMovieButton() {
        System.out.println("Hulu Movies:");
        for(int i = 0; i < movies.length; i++) {
            System.out.println("- "+movies[i]);
        }
    }

    /**
     * prints the list of 5 hulu tv shows
     */
    @Override
    public void pressTVButton() {
        System.out.println("\nHulu TV Shows:");
        for(int i = 0; i < tvShows.length; i++) {
            System.out.println("- "+tvShows[i]);
        }
    }
}
