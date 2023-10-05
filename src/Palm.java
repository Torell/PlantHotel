public class Palm extends Plants{
    private final String foodType = "kranvatten"; //inkappsling

    private final double foodAmountPerMeter = 0.5;

    public Palm(String name, double length) {
        super(name, length);
    }

    @Override
    public String whatFoodAndAmount() {  //Polymorfism
        return String.format(getMessageFormat(), getName(), tapWaterAmount(), foodType);
    }
    protected double tapWaterAmount() {

        return (this.getLength() * this.foodAmountPerMeter);
    }
    public String getFoodType() {
        return foodType;
    }



}
