package model.person;

public class Seller extends Person{

//    private String name;
    private int id;
    private String shopName;

    public static int lastId = 0; // akharin id ei ke be ye seller ekhtesas dade shode

    public Seller(String name, String shopName) {
        super(name);
        System.out.println(super.name);
        System.out.println(name);
//        super.name;
//        setName(name);
        setShopName(shopName);
        setId();
        Manager.addSeller(this);
    }

//    private void setName(String name) {
//        this.name = name;
//    }

    private void setShopName(String shopName) {
        this.shopName = shopName;
    }

    private void setId() {
        this.id = lastId ++; // incremental -- 0 - 1 -2 - 3
        this.id = ++lastId;
    }


    // default constructor

//    public Seller() {
//
//    }
//
//    // multiple constructor
//
//    public Seller(String name) {
//        setName(name);
//    }

//    public static void main(String[] args) {
//        new Seller();
//        new Seller("ali");
//        Seller seller = new Seller("mohammad", "X");
//        // overload
//
////        Seller seller1 = seller;
//        Seller copySeller = new Seller(seller);
//        System.out.println(copySeller);
//        if(seller.equals(copySeller)) {
//
//        }
//    }

    // copy constructor
    public Seller(Object object) {
        super(((Seller) object).name);
        if(object == null) {
            return;
        }
        if(!(object instanceof Seller)) {
            return;
        }
        // surely it is Seller
        Seller seller = (Seller) object; // down casting
        this.name = seller.name;
        this.shopName = seller.shopName; // copy
//        this.product= Product(seller.product);
        // deep copy
        // shallow copy
        System.gc();
    }

    @Override
    public String toString() {
        return "Seller --> id = " + this.id + "\n name = " + this.name + "\n shop name = " + this.shopName;
    }

    @Override // annotation
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(!(obj instanceof Seller)) {
            return false;
        }
        Seller seller = (Seller) obj; // down casting
        if(seller.id == this.id
                && seller.name.equals(this.name)) {
            return true;
        }
        return false;
    }

    @Override
    public String myJob() {
        return "I am a seller";
    }
}
