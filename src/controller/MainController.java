package controller;

import model.person.Customer;
import model.person.Manager;
import model.person.Person;
import model.person.Seller;
import model.product.Product;

public class MainController {

    // 1- IF THEN ELSE
    // 2- SWITCH CASE
    // 3- REGEX

    // Singleton
    private MainController() { // constructor is private

    }

    private static MainController instance = null;

    public static MainController getInstance() {
        if(instance == null)
            instance = new MainController();

        return instance;
    }

    public boolean processCommand(String command) {


//        new Person();

        String[] commandArr;

        // ADD SELLER ALI FASTFOOD
        if(command.startsWith("ADD SELLER")) {
            commandArr = command.split(" ");
            new Seller(commandArr[2], commandArr[3]);
        }

        // ADD CUSTOMER HASSAN
        else if(command.startsWith("ADD CUSTOMER")) {
            commandArr = command.split(" ");
            Customer customer = new Customer(commandArr[2]);
            String name = customer.getName();
        }

        // ADD MANAGER SARA
        else if(command.startsWith("ADD MANAGER")) {
            commandArr = command.split(" ");
            new Manager(commandArr[2]);
        }

        // ADD PRODUCT MOBILE FAST_CHARGE 900
        else if(command.startsWith("ADD PRODUCT ")) {
            commandArr = command.split(" ");
            new Product(commandArr[2], commandArr[3], Double.parseDouble(commandArr[4]));
        }

        else if(command.equalsIgnoreCase("END")) {
            return true;
        }
        return false;
    }
}
