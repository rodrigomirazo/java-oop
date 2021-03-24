package pojos;

public class Mercurium extends Planet implements Exploration {

    public Mercurium(String material, String starOrbit, String gravity) {
        // Call Planet Constructor Super Class
        super("Mercurium", starOrbit, gravity);
        // Call orbitBehavior Override
        this.orbitBehavior();
    }

    @Override
    public void orbitBehavior() {
        //super.orbitBehavior();
        System.out.println("Orbit: spin-orbit");
    }

    @Override
    public void nasaExplorations() {
        System.out.println("Not yet explore");
    }
}
