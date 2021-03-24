import pojos.CelestialBody;
import pojos.Mars;
import pojos.Mercurium;
import pojos.Moon;

class Abstract {

    public static CelestialBody moon;
    public static Moon nativeMoon;

    public static void main(String[] args) {

        moon = new Moon();
        //moon.planetOrbit();

        nativeMoon = new Moon();
        nativeMoon.planetOrbit();
    }
}
