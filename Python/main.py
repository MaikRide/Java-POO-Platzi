from car import Car
from account import Account

if __name__ == "__main__":
    car = Car("AMS234", Account("Andres herrera", "cc10142356"))
    print(vars(car))
    print(vars(car.driver))
    car2 = Car("DSW06E", Account("Mike  Porras", "cc10554546"))
    print(vars(car2))
    print(vars(car2.driver))