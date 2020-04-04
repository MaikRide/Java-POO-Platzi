package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        //Car car = new Car(); // nombre clase, nombre objeto a declarar, palabra reservada new, metodo constructor por defecto
        //car.license = "AMQ123";
        //car.driver = "Andres Herrera";
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        car.passenger = 4;
        car.printDataCar();
        Car car2 = new Car("AMQ123", new Account("Juan Perez", "ADN124"));
        car2.passenger = 3;
        car2.printDataCar();
    }
}