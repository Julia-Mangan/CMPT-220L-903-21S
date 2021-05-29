
package base;

public class Plant {
    private boolean needsWatering;
    private String plantFamily;
    private String name;
    private String wateringInstructions = "Use the setWateringInstructions method.";
    private String sunlightInstructions = "Use the setSunlightInstructions method.";

    public Plant(String plantFamily, String name) {
        this.plantFamily = plantFamily;
        this.name = name;
        this.needsWatering = false;
    }

    public void toggleNeedsWatering() {
        this.needsWatering = !this.needsWatering;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlantFamily(String plantFamily) {
        this.plantFamily = plantFamily;
    }

    public void setWateringInstructions(String wateringInstructions) {
        this.wateringInstructions = wateringInstructions;
    }

    public void setSunlightInstructions(String sunlightInstructions) {
        this.sunlightInstructions = sunlightInstructions;
    }

    public String getName() {
        return name;
    }

    public String getPlantFamily() {
        return plantFamily;
    }

    public String getWateringInstructions() {
        System.out.println(wateringInstructions);
        System.out.println("Please refer to the current state of needsWatering is: " + needsWatering);
        return wateringInstructions;
    }

    public String getSunlightInstructions() {
        System.out.println(sunlightInstructions);
        return sunlightInstructions;
    }

    public boolean needsWatering() {
        System.out.println("Please refer to the current state of needsWatering is: " + needsWatering);
        return needsWatering;
    }
}
