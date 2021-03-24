package pojos;

abstract class Satellite extends CelestialBody {

    public Satellite(String name) {
        super(name);
    }

    abstract void planetOrbit();

}
