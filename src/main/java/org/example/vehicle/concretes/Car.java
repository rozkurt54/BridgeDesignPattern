package org.example.vehicle.concretes;

import org.example.vehicle.abstracts.Vehicle;
import org.example.vehicle.abstracts.Workshop;

public class Car extends Vehicle {

  public Car(Workshop workshop1, Workshop workshop2) {
    super(workshop1, workshop2);
  }

  @Override
  public void manufacture() {
    System.out.println("Car");
    workshop1.work();
    workshop2.work();
  }
}
