import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cactus igge = new Cactus(namesOfPlants.IGGE, 0.2);
        Palm laura = new Palm(namesOfPlants.LAURA, 5);
        Palm olof = new Palm(namesOfPlants.OLOF, 1);
        CarnivorousPlant meatloaf = new CarnivorousPlant(namesOfPlants.MEATLOAF, 0.7);

        List<Plants> listOfPlants = new ArrayList<>();
        listOfPlants.add(igge);
        listOfPlants.add(laura);
        listOfPlants.add(olof);
        listOfPlants.add(meatloaf);

        outerLoop:
        while (true) {
            String plantToBeFed = JOptionPane.showInputDialog(null, "Vilken växt ska få mat?").toUpperCase().trim();
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


