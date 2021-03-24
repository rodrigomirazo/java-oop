package pojos;

public class CelestialBody {

    private String name;
    private String material;

    public CelestialBody() {
        System.out.println("Unknown Celestial Body");
    }

    public CelestialBody(String name) {
        this.name = name;
        System.out.println(this.name + " Is a Celestial Body");
    }

    public CelestialBody(String name, String material) {
        this.name = name;
        this.material = material;
        System.out.println(this.name + " Is a Celestial Body & is made out of " + this.material);
    }

    public String getName() {
        return name;
    }

    public CelestialBody setName(String name) {
        this.name = name;
        return this;
    }

    public String getMaterial() {
        return material;
    }

    public CelestialBody setMaterial(String material) {
        this.material = material;
        return this;
    }
}
