import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public abstract class Plants implements Food{
    private namesOfPlants name;
    private double length;
    private String filePath;
    private String foodType;

    public Plants(namesOfPlants name, double length) {
        this.name = name;
        this.length = length;
        this.filePath = "./src/" + name + "FeedingRecord.txt";
    }
    public void feed() {
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("EEEE, dd MMMM, HH:mm");
        String toWrite = LocalDateTime.now().format(myFormat);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(getFilePath(),true))) {
            bw.write(toWrite);
            bw.newLine();
            String messageFormat = "%s suger i sig %s och ser prunkande ut";
            JOptionPane.showMessageDialog(null,String.format(messageFormat, getName(), getFoodType()));
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public String lastFed() {
        Path path = Paths.get(getFilePath());
        List<String> stringList = new ArrayList<>();
            try {
                if (!Files.exists(path)) {
                    JOptionPane.showMessageDialog(null, getName() + " Har aldrig fått mat, bäst vi matar henom nu");
                    feed();
                }
                stringList = Files.readAllLines(path);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "error" + e.getMessage());
            }
            return stringList.get(stringList.size() - 1);


    }

    public int getFeedAnswer() {
        return JOptionPane.showConfirmDialog(null, this.getName() + " fick mat "
                + this.lastFed()
                + " Vill du mata " + this.getName() + " nu?");
    }

    public String getFoodType() {
        return foodType;
    }

    public String getName() {
        return name.plantName;
    }

    public String getFilePath() {
        return filePath;
    }


    public double getLength() {
        return length;
    }

    public String getMessageFormat() {
        String messageFormatWhatFoodAndAmount = "%s behöver %.2f liter %s";
        return messageFormatWhatFoodAndAmount;
    }
}
