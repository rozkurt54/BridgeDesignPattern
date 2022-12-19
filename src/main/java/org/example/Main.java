package org.example;

import org.example.vehicle.abstracts.Vehicle;
import org.example.vehicle.abstracts.Workshop;
import org.example.vehicle.concretes.*;

public class Main {
  public static void main(String[] args) {

    Workshop produceWorkshop = new Produce();
    Workshop assembleWorkshop = new Assemble();

    Vehicle car = new Car(produceWorkshop, assembleWorkshop);
    Vehicle bike = new Bike(produceWorkshop, assembleWorkshop);
    Vehicle truck = new Truck(produceWorkshop, assembleWorkshop);

    car.manufacture();
    bike.manufacture();
    truck.manufacture();





  }
}