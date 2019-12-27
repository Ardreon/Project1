package model;


import model.entity.AirplaneAbstract;

import java.util.Comparator;

public class ComparatorByRange implements Comparator {
    public int compare(Object o1, Object o2){
        AirplaneAbstract sh1 = (AirplaneAbstract) o1;
        AirplaneAbstract sh2 = (AirplaneAbstract) o2;
        if (sh1.getFly_range() < sh2.getFly_range()) return -1;
        if (sh2.getFly_range() > sh2.getFly_range()) return 1;
        return 0;

    }

}
