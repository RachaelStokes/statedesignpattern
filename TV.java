/**
 * @author Rachael Stokes
 */
public class TV {
    private State HomeState;
    private State NetflixState;
    public State HuluState;

    private State state;
    public TV() {

    }

    public void pressHomeButton() {
        state.pressHomeButton();
    }
}