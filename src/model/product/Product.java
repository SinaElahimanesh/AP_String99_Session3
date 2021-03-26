package model.product;

import model.person.Master;
import model.person.Seller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

public class Product implements Comparator<Product>, Comparable<Product> { // generic

    // fields
    private String name;
    private String productDescription;
    private double price;
    public static ArrayList<Product> allProducts;
    private LocalDateTime dateTime;

    // Composition
    private Category category;
    private ArrayList<Seller> allSellers;

    // Initialization Block
    static {
        allProducts = new ArrayList<>();
    } // once

    public Product(String productName, String productDescription, double price) {
        setName(productName);
        setProductDescription(productDescription);
        setPrice(price);
        this.allSellers = new ArrayList<>(); // Constructor
        allProducts.add(this);

//        Date date = new Date(2001, Calendar.SEPTEMBER, 19);
        dateTime = LocalDateTime.now();
//        dateTime = LocalDateTime.of
//        LocalDateTime.now();
    }

    // this --> object
    // setters
    private void setName(String name) {
        this.name = name;
    }

    private void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    private void setPrice(double price) {
        this.price = price;
    } // mutable

    // getters
    public String getName() {
        return name;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getPrice() {
        return price;
    }

    // mutable
    public void setCategory(Category category) {
        this.category = category;
    }

    public void addSeller(Seller seller) {
        this.allSellers.add(seller); // Composition
    }

    // immutable
    // field --> private
    // setter -
    // setter --> private


    public int getCategoryValue() {
        return category.getId();
    }

    @Override
    public int compare(Product o1, Product o2) {
//        if(o1.price < o2.price) { // koochikatr --> manfi
//            return -1;
//        }
//        if(o1.price == o2.price) {
//            return 0;
//        } else {
//            return 1;
//        }
        return (int) (o1.price - o2.price);
    }

    @Override
    public int compareTo(Product o) {
        return (int) (this.price - o.price);
    }

//    public static void main(String[] args) {
//        Customer customer = new Customer("ali");
////        System.out.println(customer.name); // package access
//    }
}
