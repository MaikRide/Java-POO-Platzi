<?php
requiere_once('car.php')
class UberVan extends Car{
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial){
        parent::__contrnuct($license,$driver);
        $this->typeCarAccepted= $typeCarAccepted;
        $this->seatsMaterial= $seatsMaterial;


    }
}
