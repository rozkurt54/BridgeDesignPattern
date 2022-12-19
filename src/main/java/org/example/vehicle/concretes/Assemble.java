package org.example.vehicle.concretes;

import org.example.vehicle.abstracts.Workshop;

public class Assamble implements Workshop {

  @Override
  public void work() {
    System.out.print(" and");
    System.out.println( "assambled.");
  }
}
