package Java;

import java.util.ArrayList;
import java.util.Map;


class UberVan extends Car{
    Map<String, ArrayList<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    String brand;
    String model;

    public UberVan(final String license, final Account driver,
    Map<String, ArrayList<String,Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }
    
}