public class HomeState implements State{
    private TV tv;

    public HomeState(TV tv) {
		this.tv = tv;
    }
    
    public void pressHomeButton() {
        System.out.println("TV is already on the home screen");
    }

    public void pressNetflixButton() {
        System.out.println("\nLoading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    public void pressHuluButton() {
        System.out.println("\nLoading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    public void pressMovieButton() {
        System.out.println("Home: You must pick an app to show movies.");
    }

    public void pressTVButton() {
        System.out.println("Home: You mut pick an app to show tv shows.");
    }
}
