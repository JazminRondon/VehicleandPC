package HW2;

public abstract class Monitor extends PC {
    private String model;
    private String manufacturer;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.nativeResolution = nativeResolution;
    }

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
}
