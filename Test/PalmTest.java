import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {
    private final Palm lauraTest = new Palm(namesOfPlants.LAURA, 10);
    @Test
    void TapWaterAmount() {
        double expectedWaterAmount = 5;
        double actualWaterAmount = lauraTest.tapWaterAmount();
        Assertions.assertEquals(expectedWaterAmount, actualWaterAmount);

    }
}