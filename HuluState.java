public class HuluState implements State {
    private TV tv;

    public HuluState(TV tv) {
		this.tv = tv;
    }

    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...");
        tv.setState(tv.getHomeState());
    }

    public void pressNetflixButton() {
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());
    }

    public void pressHuluButton() {
        
    }

    public void pressMovieButton() {
    }

    public void pressTVButton() {
    }
}
