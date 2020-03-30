package at.cc.jku.aircraft;

/*
Passagierflugzeug
---------------------
amountOfPassengers
maximumPassengers
getWeight() double
boarding()
boarding(int)
getPassengers() int

 */
public class PassengerPlane extends Aircraft {

    int amountOfPassengers;
    int maximumPassengers;
    double averagePassengersWeight;

    public PassengerPlane(String identification, double maximumWeight, double emptyWeight, double fuelCapacity,
                          int maximumPassengers) {

        super(identification, maximumWeight, emptyWeight, fuelCapacity);

        this.maximumPassengers = maximumPassengers;
        this.averagePassengersWeight = 105.0;

    }

    @Override
    public double getWeight() {
        //double weight = super.getWeight() + this.amountOfPassengers * this.averagePassengersWeight;
        return super.getWeight() + this.amountOfPassengers * this.averagePassengersWeight;
    }

    @Override
    public double getWeightWithPrintLine() {
        double weight = getWeight();
        System.out.println("The weight is: " + weight);
        return weight;
    }

    public void boardingInt(int numberOfPassengers) {
        this.amountOfPassengers += numberOfPassengers;
        if (this.amountOfPassengers > this.maximumPassengers) {
            System.out.println("Maximum passengers reached");
            this.amountOfPassengers = this.maximumPassengers;
        }

    }

    public void boarding (){
        boardingInt(1);
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public void getAmountOfPassengersPrintLine(){
        System.out.println("The number of Passengers: " + getAmountOfPassengers());
    }
}
