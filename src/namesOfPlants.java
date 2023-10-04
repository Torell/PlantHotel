public enum namesOfPlants {
    IGGE ("Igge"),
    LAURA ("Laura"),
    OLOF ("Olof"),
    MEATLOAF ("Meatloaf");

    public final String plantName;

    namesOfPlants(String plantName) {
        this.plantName = plantName;
    }

    public String getPlantName() {
        return plantName;
    }
}
