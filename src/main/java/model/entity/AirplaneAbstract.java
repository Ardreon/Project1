package model.entity;

public abstract class AirplaneAbstract {

     private PlaneModels planemodel;
     private int capacity;
     private double carrying_capacity;
     private double fly_range;
     private double fuel_capacity;

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getCarrying_capacity() {
        return carrying_capacity;
    }

    public void setCarrying_capacity(double carrying_capacity) {
        this.carrying_capacity = carrying_capacity;
    }

    public double getFly_range() {
        return fly_range;
    }

    public void setFly_range(double fly_range) {
        this.fly_range = fly_range;
    }

    public double getFuel_capacity() {
        return fuel_capacity;
    }

    public void setFuel_capacity(double fuel_capacity) {
        this.fuel_capacity = fuel_capacity;
    }


    public AirplaneAbstract(PlaneModels planemodel, int capacity, double carrying_capacity, double fly_range, double fuel_capacity) {
        this.planemodel = planemodel;
        this.capacity = capacity;
        this.carrying_capacity = carrying_capacity;
        this.fly_range = fly_range;
        this.fuel_capacity = fuel_capacity;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " : planemodel = " + planemodel + ", capacity = " + capacity + ", carrying_capacity = " + carrying_capacity +
                ", fly_range = " + fly_range  + ", fuel_capacity = " + fuel_capacity;
    }

    private double fuelConsumption(double fly_range, double fuel_capacity){
        return fly_range/fuel_capacity;
    }

}
