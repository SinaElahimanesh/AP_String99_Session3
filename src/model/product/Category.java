package model.product;

public enum Category {
    DIGITAL(0),
    HOME_APPLIANCES(1),
    CLOTHES(2),
    FOOD(3),
    CAR(4);

    int id;

    Category(int id) {
        setId(id);
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }
}
