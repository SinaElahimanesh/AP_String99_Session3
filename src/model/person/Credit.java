package model.person;

public enum Credit {
    SUCCESSFUL("successfully done"),
    NOT_HAVE_ENOUGH_MONEY("unfortunately you do not have enough money!");

    private String value;

    Credit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

//    public void setValue(String value) {
//        this.value = value;
//    }
}
