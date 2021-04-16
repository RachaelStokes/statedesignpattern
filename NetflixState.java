/**
 * NetflixState implements the State interface and writes the methods to be specific for a NetflixState
 * @author Rachael Stokes
 */
public class NetflixState implements State {
    private TV tv; //instance of a tv used to change state based on current state
    private String[] movies = {"Legally Blonde", "Crazy Stupid Love", "My Fair Lady", "Lady Bird", "Superbad"}; //list of movies netflix state contains
    private String[] tvShows = {"New Girl", "Jane the Virgin", "Virgin River", "Community", "Criminal Minds"}; //list of tv shows netflix state contains

    /**
     * constructor method sets the tv to the tv parameter
     * @param tv instance of tv to use in this class
     */
    public NetflixState(TV tv) {
		this.tv = tv;
    }

    /**
     * prints out that home screen is loading and sets the state to home screen
     */
    @Override
    public void pressHomeButton() {
        System.out.println("\nLoading the Home Screen...\n");
        tv.setState(tv.getHomeState());
    }

    /**
     * prints that we are already in the netflix state
     */
    @Override
    public void pressNetflixButton() {
        System.out.println("We are already in Netflix");
    }

    /**
     * prints that hulu is loading and sets the state to hulu
     */
    @Override
    public void pressHuluButton() {
        System.out.println("\nLoading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    /**
     * prints list of the 5 netflix movies
     */
    @Override
    public void pressMovieButton() {
        System.out.println("Netflix Movies:");
        for(int i = 0; i < movies.length; i++) {
            System.out.println("- "+movies[i]);
        }
    }

    /**
     * prints the list of the 5 netflix tv shows
     */
    @Override
    public void pressTVButton() {
        System.out.println("\nNetflix TV Shows:");
        for(int i = 0; i < tvShows.length; i++) {
            System.out.println("- "+tvShows[i]);
        }
    }
}
