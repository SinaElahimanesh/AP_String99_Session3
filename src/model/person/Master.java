package model.person;

public class Master {

    private static Master instance = null;

    private Master() {

    }

    static Master getInstance() { // package access
        if(instance == null)
            instance = new Master();
        return instance;
    }
}
