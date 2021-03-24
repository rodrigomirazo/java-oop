package pojos;

public class Moon extends Satellite {

    public Moon() {
        super("Moon");
    }

    @Override
    public void planetOrbit() {
        System.out.println("Orbits around planet Earth");
    }
}
