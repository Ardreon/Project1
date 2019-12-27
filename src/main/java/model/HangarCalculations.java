package model;

import java.util.Arrays;
import java.util.Comparator;
import model.Hangar;
import model.entity.AirplaneAbstract;

public class HangarCalculations {

    private AirplaneAbstract[] planes;
    private AirplaneAbstract[] planes2;

    public HangarCalculations() {
        planes = Hangar.getArrayPlanes();
    }

    public AirplaneAbstract[] getPlanes() {
        return planes;
    }

    public void setPlanes(AirplaneAbstract[] planes) {
        this.planes = planes;
    }


    public double getPlanesCapacity() {
        double sum = 0.0;
        for (AirplaneAbstract elem : planes) {
            sum += elem.getCapacity();

        }
        return sum;
    }

    public double getPlanesCarryingCapacity() {
        double sum = 0.0;
        for (AirplaneAbstract elem : planes) {
            sum += elem.getCarrying_capacity();

        }
        return sum;
    }

    public void planesRangeSort() {
        Arrays.sort(planes, new ComparatorByRange());
    }

    public void planesFuelSort() {
        Arrays.sort(planes, new ComparatorByFuel());
    }

    public void filterByRange(int[] parameters) {
        int from = parameters[0];
        int to = parameters[1];
        planes2 = new AirplaneAbstract[];

        for (AirplaneAbstract plane : planes) {
            if (plane.getFuel_capacity() >= from && plane.getFuel_capacity() <= to)
                for (int i = 0; i < planes.length; i++)
                    planes2[i] = plane;
        }
    }
}

