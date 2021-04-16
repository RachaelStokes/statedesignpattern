/**
 * HomeState implements the State interface and writes the methods to be specific for a HomeState
 * @author Rachael Stokes
 */
public class HomeState implements State{
    private TV tv; //instance of a tv used to change state based on current state

    /**
     * constructor method sets the tv to the tv parameter
     * @param tv instance of tv to use in this class
     */
    public HomeState(TV tv) {
		this.tv = tv;
    }
    
    /**
     * prints that the tv is already on the home screen
     */
    @Override
    public void pressHomeButton() {
        System.out.println("TV is already on the home screen");
    }

    /**
     * prints that netflix is loading and sets the state to netflix state
     */
    @Override
    public void pressNetflixButton() {
        System.out.println("\nLoading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    /**
     * prints that hulu is loading and sets the state to hulu state
     */
    @Override
    public void pressHuluButton() {
        System.out.println("\nLoading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    /**
     * prints that the state has no movies in home
     */
    @Override
    public void pressMovieButton() {
        System.out.println("Home: You must pick an app to show movies.");
    }

    /**
     * prints that the state has no tv shows in home
     */
    @Override
    public void pressTVButton() {
        System.out.println("Home: You mut pick an app to show tv shows.");
    }
}
