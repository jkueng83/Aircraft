package at.cc.jku.aircraft;

/*
Flugzeug
-----------
identification
maximumWeight
emptyWeight
fuelCapacity
getWeight() double
fuel(double)

 */
public class Aircraft {
    protected String identification; // protected: in den vererbten Objekten und im Geichen Ordner sichtbar
    protected double maximumWeight;
    private double emptyWeight;
    private double fuelCapacity;

    private double fuel;

    public Aircraft(String identification, double maximumWeight, double emptyWeight, double fuelCapacity) {
        this.identification = identification;
        this.maximumWeight = maximumWeight;
        this.emptyWeight = emptyWeight;
        this.fuelCapacity = fuelCapacity;
    }

    public void fuelAmountInL(double l) { // Auftanken
        this.fuel += l;
        if (this.fuel > this.fuelCapacity) {
            this.fuel = this.fuelCapacity;
            System.out.println("it was to much. we set it to: " + this.fuel);
        }
    }

    public double getWeight() {
        // Kerosindichte 0,8kg/l
        //boolean printWeight = false;
        double weight = this.emptyWeight + (this.fuel * 0.8);
        return weight;
    }

    public double getWeightWithPrintLine() {
        // Kerosindichte 0,8kg/l
        //boolean printWeight = false;
        double weight = getWeight();//this.emptyWeight + (this.fuel * 0.8);

            System.out.println("The weight is: " + weight);

        return weight;
    }

    public double getFuel() {
        return fuel;
    }

}
