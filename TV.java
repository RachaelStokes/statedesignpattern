/**
 * TV class that calls the methods for the state's buttons and changes and returns states
 * @author Rachael Stokes
 */
public class TV {
    private State HomeState; //a state that will be used as the home state
    private State NetflixState; //a state that will be used as the netflix
    private State HuluState; //a state that will be used as the hulu state
    private State state; //the state that keeps track of the current state of the tv

    /**
     * constructor method sets all of the states
     */
    public TV() {
        this.HomeState = new HomeState(this);
        this.NetflixState = new NetflixState(this);
        this.HuluState = new HuluState(this);
        this.state = HomeState;
    }

    /**
     * method that calls the current state's press home button method
     */
    public void pressHomeButton() {
        state.pressHomeButton();
    }

    /**
     * method that calls the current state's press netflix button method
     */
    public void pressNetflixButton() {
        state.pressNetflixButton();
    }

    /**
     * method that calls the current state's press hulu button method
     */
    public void pressHuluButton() {
        state.pressHuluButton();
    }

    /**
     * method that calls the current state's press movie button method
     */
    public void pressMovieButton() {
        state.pressMovieButton();
    }

    /**
     * method that calls the current state's press tv button method
     */
    public void pressTVButton() {
        state.pressTVButton();
    }

    /**
     * Method that changes the current state to the state parameter
     * @param state state that current state will be changed to
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Method that returns the home state
     * @return home state
     */
    public State getHomeState() {
        return HomeState;
    }

    /**
     * method that returns the netflix state
     * @return netflix state
     */
    public State getNetflixState() {
        return NetflixState;
    }

    /**
     * method that returns the hulu state 
     * @return hulu state
     */
    public State getHuluState() {
        return HuluState;
    }
}