package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        Car car = new Car(); // nombre clase, nombre objeto a declarar, palabra reservada new, metodo constructor por defecto
        car.license = "AMQ123";
        car.driver = "Andres Herrera";
        car.passenger = 4;
        car.printDataCar();
        
        Car car2 = new Car();
        car2.license ="DSW06E";
        car2.driver = "Juan Perez";
        car2.passenger = 3;
        car2.printDataCar();
    }
}