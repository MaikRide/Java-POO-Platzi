<?php
    require_once("Car.php");
    require_once("uberX.php");
    require_once("uberPool.php");
    require_once("account.php");
    $uberX = new Car("ADM054", new Account("Andres Torres", "CC1254875689"), "Chevrolet", "Spark");
    $uberX->printDataCar();
    $uberPool = new Car("MAD054", new Account("Andrea Ferran", "CC4554875689"), "Mazda", "3");
    $uberPool->printDataCar();
?>