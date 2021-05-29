package base;

public class Main {

    public static void main(String[] args) {

        Plant philip = new Plant("Pothos", "Philip");
        Plant purple = new Plant("Snake Plant", "Purple");

        philip.setWateringInstructions("Philip: Low maintenance - a couple weeks without water.");
        philip.getWateringInstructions();

        philip.setSunlightInstructions("Philip: Medium to bright levels of sunlight.");
        philip.getSunlightInstructions();

        purple.setWateringInstructions("Purple: Low maintenance - a couple weeks without water.");
        purple.getWateringInstructions();

        purple.setSunlightInstructions("Purple: Medium to bright levels of sunlight.");
        purple.getSunlightInstructions();

    }
}
