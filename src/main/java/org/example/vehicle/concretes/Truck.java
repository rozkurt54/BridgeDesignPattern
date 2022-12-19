package org.example.vehicle.concretes;

import org.example.vehicle.abstracts.Vehicle;
import org.example.vehicle.abstracts.Workshop;

public class Truck extends Vehicle {

  public Truck(Workshop workshop1, Workshop workshop2) {
    super(workshop1, workshop2);
  }

  @Override
  public void manufacture() {

    System.out.println("Truck");
    workshop1.work();
    workshop2.work();


  }
}
