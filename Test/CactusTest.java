import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CactusTest {

    Cactus test = new Cactus(namesOfPlants.IGGE.getPlantName(), namesOfPlants.IGGE.getPlantLength());
    @Test
    void mineralWaterAmount() {
        double expectedMineralWaterAmount = 0.2;
        double actualMineralWaterAmount = test.mineralWaterAmount();
        Assertions.assertEquals(expectedMineralWaterAmount, actualMineralWaterAmount);
    }
}