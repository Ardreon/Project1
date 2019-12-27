package model;

import model.entity.AirplaneAbstract;

import java.util.Comparator;

public class ComparatorByFuel implements Comparator {
    public int compare(Object o1, Object o2){
        AirplaneAbstract sh1 = (AirplaneAbstract) o1;
        AirplaneAbstract sh2 = (AirplaneAbstract) o2;
        if (sh1.getFuel_capacity() < sh2.getFuel_capacity()) return -1;
        if (sh2.getFuel_capacity() > sh2.getFuel_capacity()) return 1;
        return 0;

    }
}
