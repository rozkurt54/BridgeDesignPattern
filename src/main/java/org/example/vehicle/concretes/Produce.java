package org.example.vehicle.concretes;

import org.example.vehicle.abstracts.Workshop;

public class Produce implements Workshop {
  @Override
  public void work() {
    System.out.print("Produced");
  }
}
