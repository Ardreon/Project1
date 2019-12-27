package model.entity;

public class BOEING_767 extends AirplaneAbstract {

      public BOEING_767(PlaneModels planeModel, int capacity, double carrying_capacity, double fly_range, double fuel_consumption){
          super(planeModel, capacity, carrying_capacity, fly_range, fuel_consumption);
      }

      @Override
    public String toString(){
          return super.toString();
      }

}
