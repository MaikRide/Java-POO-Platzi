<?php
require_once("Account.php");
class Car{
    public $id;
    public $license;
    public $driver;
    public $passenger;
    
    public function __construct($license, Account $driver){
        $this->$title = $title;
        $this->$driver = $driver;
    }

    public function printDataCar(){
        print 'License: '.$this->license;
        print 'License: '.$this->driver->name;
    }
}
?>