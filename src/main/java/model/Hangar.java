package model;


import model.entity.*;
import model.entity.AirplaneAbstract;
import model.entity.BOEING_777;
import model.entity.BOEING_737;
import model.entity.BOEING_767;
import model.entity.EMBRAER_190;
import model.entity.EMBRAER_195;
import model.entity.PlaneModels;



public class Hangar {
    public static AirplaneAbstract[] getArrayPlanes() {
        return new AirplaneAbstract[]{

                new BOEING_777(PlaneModels.BOEING_777, 361, 344, 14075, 181280),
                new BOEING_777(PlaneModels.BOEING_777, 361, 344, 14075, 181280),
                new BOEING_777(PlaneModels.BOEING_777, 361, 344, 14075, 181280),
                new BOEING_777(PlaneModels.BOEING_777, 361, 344, 14075, 181280),
                new BOEING_777(PlaneModels.BOEING_777, 361, 344, 14075, 181280),
                new BOEING_767(PlaneModels.BOEING_767, 375, 204.12, 10450, 173000),
                new BOEING_767(PlaneModels.BOEING_767, 375, 204.12, 10450, 173000),
                new BOEING_767(PlaneModels.BOEING_767, 375, 204.12, 10450, 173000),
                new BOEING_737(PlaneModels.BOEING_737, 215, 85200, 5925, 20894),
                new BOEING_737(PlaneModels.BOEING_737, 215, 85200, 5925, 20894),
                new EMBRAER_190(PlaneModels.EMBRAER_190, 104, 47800, 3200, 16250),
                new EMBRAER_190(PlaneModels.EMBRAER_190, 104, 47800, 3200, 16250),
                new EMBRAER_190(PlaneModels.EMBRAER_190, 104, 47800, 3200, 16250),
                new EMBRAER_195(PlaneModels.EMBRAER_195, 118, 48790, 3990, 16250),
                new EMBRAER_195(PlaneModels.EMBRAER_195, 118, 48790, 3990, 16250),
                new EMBRAER_195(PlaneModels.EMBRAER_195, 118, 48790, 3990, 16250),
                new EMBRAER_195(PlaneModels.EMBRAER_195, 118, 48790, 3990, 16250)
        };
    }
}
