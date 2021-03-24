package pojos;

public class Earth extends Planet {

    private int waterPercentage;

    public Earth(String material, String gravity, int waterPercentage) {
        // Call Planet Constructor Super Class
        super("Earth", material, gravity);
        //super("Earth", material);

        // Call orbitBehavior from Super Class
        this.orbitBehavior();
        //Set particular property
        this.waterPercentage = waterPercentage;
        System.out.println("Earth has a Water Percentage of: " + this.waterPercentage);
    }

    public int getWaterPercentage() {
        return waterPercentage;
    }

    public Earth setWaterPercentage(int waterPercentage) {
        this.waterPercentage = waterPercentage;
        return this;
    }
}
