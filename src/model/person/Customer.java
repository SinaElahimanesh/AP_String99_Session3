package model.person;

public class Customer extends Person{
//    String name; // package access
    private double credit; // private

    public Customer(String name) {
        super(name);
        // this --> Customer
        // super --> Person
//        setName(name);
    }

//    private void setName(String name) {
//        this.name = name;
//    }

    public void depositMoney(double money) {
        credit += money;
    }

    public Credit drawMoney(double money) {
        if(credit >= money) {
            credit -= money;
            return Credit.SUCCESSFUL;
        } else {
            return Credit.NOT_HAVE_ENOUGH_MONEY;
        }
    }

    @Override
    public String myJob() {
        return "I am a customer";
    }
}
