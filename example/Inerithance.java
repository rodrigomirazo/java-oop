import pojos.Earth;
import pojos.Mercurium;
import pojos.Planet;

class Inerithance {

    public static Planet planet;
    public static Earth earth;
    public static Mercurium mercurium;

    public static void main(String[] args) {

        //Single Inherance
        /*
        planet = new Planet("Venus", "Sun", "8.87");
        */
        System.out.println("");

        //Multi Level
        earth = new Earth(
                "rock",
                "9.81",
                75
        );

        /*
        System.out.println("");
        mercurium = new Mercurium(
                "mercurium",
                "Sun",
                "3.7");
        */
    }
}
