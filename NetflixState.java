public class NetflixState implements State {
    private TV tv;
    private String[] movies = {"Legally Blonde", "Crazy Stupid Love", "My Fair Lady", "Lady Bird", "Superbad"};
    private String[] tvShows = {"New Girl", "Jane the Virgin", "Virgin River", "Community", "Criminal Minds"};

    public NetflixState(TV tv) {
		this.tv = tv;
    }

    public void pressHomeButton() {
        System.out.println("\nLoading the Home Screen...\n");
        tv.setState(tv.getHomeState());
    }

    public void pressNetflixButton() {
        System.out.println("We are already in Netflix");
    }

    public void pressHuluButton() {
        System.out.println("\nLoading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    public void pressMovieButton() {
        System.out.println("Netflix Movies:");
        for(int i = 0; i < movies.length; i++) {
            System.out.println("- "+movies[i]);
        }
    }

    public void pressTVButton() {
        System.out.println("\nNetflix TV Shows:");
        for(int i = 0; i < tvShows.length; i++) {
            System.out.println("- "+tvShows[i]);
        }
    }
}
