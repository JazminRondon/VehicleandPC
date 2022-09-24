package HW2;

public class Monitor {
    private String model;
    private String manufacturer;
    private Resolution nativeResolution;

    public Monitor() {

    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public void setNativeResolution(Resolution nativeResolution) {
        this.nativeResolution = nativeResolution;
    }
    public void drawPixel(int x, int y, String color){
        System.out.println("Draw pixel at" +x+","+y+""+"in color"+color);

    }
}
