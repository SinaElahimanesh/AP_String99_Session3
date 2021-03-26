package model.person;

import java.util.ArrayList;

public class Manager implements JobInterface, SleepInterface{

    private String name;
    private static ArrayList<Seller> allSellers;

    static {
        allSellers = new ArrayList<>();
    }

    public Manager(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    public static void addSeller(Seller seller) {
        allSellers.add(seller);
    }

    @Override
    public String myJob() {
        return "I am a manager";
    }

    @Override
    public String sleep() {
        return null;
    }

//    public static void main(String[] args) {
//        Customer customer = new Customer("ali");
//        customer.name = "hasan";
//        System.out.println(customer.name);
//    }
}
