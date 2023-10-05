import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class CarnivorousPlantTest {

    CarnivorousPlant test = new CarnivorousPlant(namesOfPlants.IGGE.getPlantName(), 100);

    @Test
    void proteinShakeAmount() {
        double expectedAmountOfProteinDrink = 20.1;
        double actualAmountOfProteinDrink = test.proteinShakeAmount();
        Assertions.assertEquals(expectedAmountOfProteinDrink,actualAmountOfProteinDrink);
    }
}