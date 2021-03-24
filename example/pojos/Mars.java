package pojos;

public class Mars extends Planet implements Exploration {


    public Mars(String gravity) {
        super("Mars", "sun", gravity);
    }

    @Override
    public void nasaExplorations() {
        System.out.println("Explore by Nasa");
    }
}
