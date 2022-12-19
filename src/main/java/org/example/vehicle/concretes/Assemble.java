package org.example.vehicle.concretes;

import org.example.vehicle.abstracts.Workshop;

public class Assemble implements Workshop {

  @Override
  public void work() {
    System.out.print(" and");
    System.out.println( " assembled.");
  }
}
