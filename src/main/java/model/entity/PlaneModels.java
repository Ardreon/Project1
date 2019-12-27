package model.entity;


public enum PlaneModels {
    BOEING_777(3),
    BOEING_767(4),
    BOEING_737(24),
    EMBRAER_190(5),
    EMBRAER_195(2);

    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    PlaneModels(int quantity) {
        this.quantity = quantity;
    }
}