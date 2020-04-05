package Java;

import java.util.ArrayList;
import java.util.Map;


class UberBlack extends Car{
    Map<String, ArrayList<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    String brand;
    String model;

    public UberBlack(final String license, final Account driver,
    Map<String, ArrayList<String,Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }
    
}