import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class PalmTest {
    private final Palm lauraTest = new Palm(namesOfPlants.LAURA.getPlantName(), 10);
    @Test
    void TapWaterAmount() {
        double expectedWaterAmount = 5;
        double actualWaterAmount = lauraTest.tapWaterAmount();
        Assertions.assertEquals(expectedWaterAmount, actualWaterAmount);

    }
}