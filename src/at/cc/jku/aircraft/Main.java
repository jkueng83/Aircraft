package at.cc.jku.aircraft;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Aircraft");
        System.out.println("################");

        Aircraft a1 = new Aircraft("1578 ABH",20000,10000,5000);

        a1.getWeightWithPrintLine();

        a1.fuelAmountInL(1000);

        a1.getWeightWithPrintLine();
        System.out.println("--- Cargo Aircraft ---");
        CargoAircraft c1 = new CargoAircraft("1234hjz",30000,16000,
                7000);

        c1.getWeightWithPrintLine();

        c1.fuelAmountInL(5000);
        c1.getWeightWithPrintLine();

        c1.load(7000);
        c1.getWeightWithPrintLine();

        System.out.println("--- Passenger Plane ---");
        PassengerPlane pp = new PassengerPlane("kkkd125",20000,10000,
                5000,200);

        pp.boardingInt(5);
        pp.getAmountOfPassengersPrintLine();
        pp.boarding();
        pp.getAmountOfPassengersPrintLine();
        pp.getWeightWithPrintLine();
        pp.fuelAmountInL(1200);
        pp.getWeightWithPrintLine();
        pp.boardingInt(192);
        pp.getAmountOfPassengersPrintLine();
        pp.boarding();
        pp.boarding();
        pp.boarding();
        pp.boardingInt(2);
        pp.getAmountOfPassengersPrintLine();
        pp.getWeightWithPrintLine();





    }
}
