public class CarnivorousPlant extends Plants{
    protected final String foodType = "proteindryck";
    private final double baseFoodAmount = 0.1;
    private final double foodAmounntPerMeter = 0.2;


    public CarnivorousPlant(namesOfPlants name, double length) {
        super(name, length);
    }

    @Override
    public String whatFoodAndAmount() { //Polymorfism
        return String.format(getMessageFormat(), getName(), proteinShakeAmount(),foodType);
    }

    protected double proteinShakeAmount() { //Inkapsling
        return this.baseFoodAmount + (this.getLength()*this.foodAmounntPerMeter);
    }
    public String getFoodType() {
        return foodType;
    }
}
