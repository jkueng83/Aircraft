package at.cc.jku.aircraft;

/*
Frachtflugzeug
--------------
cargo
-
getWeight() double
load(double)
unload() double

 */

public class CargoAircraft extends Aircraft {

    double cargoKg;

    public CargoAircraft(String identification, double maximumWeight, double emptyWeight, double fuelCapacity) {
        super(identification, maximumWeight, emptyWeight, fuelCapacity);
    }

    public void load(double loadKg) {
        this.cargoKg = loadKg;

    }

    public double unload() {
        double load = this.cargoKg;
        this.cargoKg = 0.0;
        return load;
    }

    @Override
    public double getWeight() {
        double weight = super.getWeight() + cargoKg;
        //weight = super.getWeight();
        return weight;
    }

    @Override
    public double getWeightWithPrintLine() {
        double weight = getWeight();
        System.out.println("The weight is: " + weight);
        //return super.getWeightWithPrintLine(printWeight);
        return weight;
    }
}
