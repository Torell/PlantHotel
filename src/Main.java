import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cactus igge = new Cactus(namesOfPlants.IGGE.getPlantName(), namesOfPlants.IGGE.getPlantLength());
        Palm laura = new Palm(namesOfPlants.LAURA.getPlantName(), namesOfPlants.LAURA.getPlantLength());
        Palm olof = new Palm(namesOfPlants.OLOF.getPlantName(), namesOfPlants.OLOF.getPlantLength());
        CarnivorousPlant meatloaf = new CarnivorousPlant(namesOfPlants.MEATLOAF.getPlantName(), namesOfPlants.MEATLOAF.getPlantLength());

        List<Plants> listOfPlants = new ArrayList<>();
        listOfPlants.add(igge);
        listOfPlants.add(laura);
        listOfPlants.add(olof);
        listOfPlants.add(meatloaf);

        outerLoop:
        while (true) {
            String plantToBeFed = JOptionPane.showInputDialog(null, "Vilken växt ska få mat?").trim();
            if (plantToBeFed.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Vänligen ange ett namn på växten du vill mata");
                continue;
            }
            
            for (Plants plant : listOfPlants) {
                if (plant.getName().equalsIgnoreCase(plantToBeFed)) {
                    JOptionPane.showMessageDialog(null, plant.whatFoodAndAmount());
                    int feedAnswer = plant.getFeedAnswer();
                    if (feedAnswer == JOptionPane.YES_OPTION) {
                       plant.feed();
                    }
                    feedAnswer = JOptionPane.showConfirmDialog(null, "Vill du mata någon annan växt?");
                    if (feedAnswer == JOptionPane.YES_OPTION) {
                        continue outerLoop;
                    }
                    break outerLoop;
                }
            }
            JOptionPane.showMessageDialog(null, "Ingen växt med det namnet bor på hotellet, försök igen!");
        }
        JOptionPane.showMessageDialog(null, "Tack för att du använde Feed-O-matic");
    }
}


