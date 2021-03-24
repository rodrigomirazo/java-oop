import pojos.Earth;
import pojos.Mars;
import pojos.Mercurium;
import pojos.Planet;

class Polymorphism {

    public static Mars mars;
    public static Mercurium mercurium;

    public static void main(String[] args) {

        mars = new Mars("3.711");
        mars.nasaExplorations();

        System.out.println("");
        mercurium = new Mercurium(
                "mercurium",
                "Sun",
                "3.7");
        // Polimorphism by Interface
        mercurium.nasaExplorations();


    }
}
