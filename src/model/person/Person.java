package model.person;

// concrete
// abstract
public abstract class Person { // abstract class
    // no one can instantiate it
    protected String name; // khodesh - va bache hash
//    protected String nationalId;

    public Person(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    public abstract String myJob(); // abstract method

    public String getName() {
        return name;
    }
}
