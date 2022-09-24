package HW2;

public class MotherBoard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    String bios;

    private void loadProgram(String programName){
        System.out.println(programName+" is now running");
    }
}
