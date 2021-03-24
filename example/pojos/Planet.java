package pojos;

public class Planet extends CelestialBody {

    private String starOrbit;
    private String gravity;

    public void orbitBehavior() {
        System.out.println("Orbit Eliptical");
    }

    public Planet(String starOrbit, String gravity) {
        //super();
        this.starOrbit = starOrbit;
        this.gravity = gravity;
    }

    public Planet(String name, String starOrbit, String gravity) {
        super(name);
        System.out.println(name + " Is a Planet");
        this.starOrbit = starOrbit;
        this.gravity = gravity;
    }

    public Planet(String name, String material, String starOrbit, String gravity) {
        super(name, material);
        this.starOrbit = starOrbit;
        this.gravity = gravity;
    }

    public String getStarOrbit() {
        return starOrbit;
    }

    public Planet setStarOrbit(String starOrbit) {
        this.starOrbit = starOrbit;
        return this;
    }

    public String getGravity() {
        return gravity;
    }

    public Planet setGravity(String gravity) {
        this.gravity = gravity;
        return this;
    }
}
