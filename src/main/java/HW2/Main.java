package HW2;

public class Main {
    public static void main(String[] args) {
        MotherBoard motherBoard=new MotherBoard();
        Case myCase=new Case();
        Monitor monitor1=new Monitor();
        PC pc=new PC(myCase,motherBoard,monitor1);

        pc.description();
        myCase.pressPowerButton();
    }

}

