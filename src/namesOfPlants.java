public enum namesOfPlants {
    IGGE ("Igge",0.2),
    LAURA ("Laura",5.0),
    OLOF ("Olof",1.0),
    MEATLOAF ("Meatloaf",0.7);

    protected final String plantName;
    private final double plantLength;

    public double getPlantLength() {
        return plantLength;
    }

    namesOfPlants(String plantName, double plantLength) {
        this.plantName = plantName;
        this.plantLength = plantLength;
    }

    public String getPlantName() {
        return plantName;
    }
}
