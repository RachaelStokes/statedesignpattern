public class HuluState implements State {
    private TV tv;
    private String[] movies = {"Wedding Crashers", "The Greatest Showman", "The Breakfast Club", "The Other Guys", "Crazy Rich Asians"};
    private String[] tvShows = {"Modern Family", "Scream Queens", "One Tree Hill", "Teen Wolf", "Dance Moms"};

    public HuluState(TV tv) {
		this.tv = tv;
    }

    public void pressHomeButton() {
        System.out.println("\nLoading the Home Screen...\n");
        tv.setState(tv.getHomeState());
    }

    public void pressNetflixButton() {
        System.out.println("\nLoading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    public void pressHuluButton() {
        System.out.println("We are already in Hulu.");
    }

    public void pressMovieButton() {
        System.out.println("Hulu Movies:");
        for(int i = 0; i < movies.length; i++) {
            System.out.println("- "+movies[i]);
        }
    }

    public void pressTVButton() {
        System.out.println("\nHulu TV Shows:");
        for(int i = 0; i < tvShows.length; i++) {
            System.out.println("- "+tvShows[i]);
        }
    }
}
