<?php
    require_once("Account.php");
    require_once("Car.php");

    $car = new Car("ADM054", new Account("Andres Torres", "CC1254875689"));
    $car->printDataCar();
?>