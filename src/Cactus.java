public class Cactus extends Plants {
    private final String foodType = "mineralvatten";

    private final double foodAmount = 0.2;

    public Cactus(namesOfPlants name, double length) {
        super(name, length);
    }

    @Override
    public String whatFoodAndAmount() { //Polymorfism
        return String.format(getMessageFormat(), getName(), mineralWaterAmount(), foodType);
    }

    protected double mineralWaterAmount() {
        return this.foodAmount;
    }

    public String getFoodType() {
        return foodType;
    }
}
