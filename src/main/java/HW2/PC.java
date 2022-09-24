package HW2;

public class PC {
    private Case myCase;
    private MotherBoard motherBoard;
    private Monitor monitor;

    public PC(Case myCase, MotherBoard motherBoard, Monitor monitor) {
        this.myCase = myCase;
        this.motherBoard = motherBoard;
        this.monitor = monitor;
    }

    public Case getMyCase() {
        return myCase;
    }

    public void setMyCase(Case myCase) {
        this.myCase = myCase;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void drawLogo(){
        monitor.drawPixel(10,45,"Red");
   }
   public void description(){
       System.out.println("Welcome to worst buy below is the description of the pc on sale today "+
               myCase.getModel()+ myCase.getManufactuer()+myCase.getPowerSupply()+myCase.getDimension());

   }
}
