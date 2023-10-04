import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousPlantTest {

    CarnivorousPlant test = new CarnivorousPlant(namesOfPlants.IGGE, 100);

    @Test
    void proteinShakeAmount() {
        double expectedAmountOfProteinDrink = 20.1;
        double actualAmountOfProteinDrink = test.proteinShakeAmount();
        Assertions.assertEquals(expectedAmountOfProteinDrink,actualAmountOfProteinDrink);
    }
}