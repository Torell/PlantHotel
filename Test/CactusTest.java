import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CactusTest {

    Cactus test = new Cactus(namesOfPlants.IGGE, 100);
    @Test
    void mineralWaterAmount() {
        double expectedMineralWaterAmount = 0.2;
        double actualMineralWaterAmount = test.mineralWaterAmount();
        Assertions.assertEquals(expectedMineralWaterAmount, actualMineralWaterAmount);
    }
}