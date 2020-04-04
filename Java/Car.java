package Java;

class Car {
    Integer id;
    String license;
    Account driver;
    int passenger;
    
    public Car(String license, Account driver){//parametros obligatorios
        this.license = license;
        this.driver = driver;
    }
    void printDataCar(){
        System.out.println("License: " + license + " Name Driver: " + driver.name);
    }   
}
    