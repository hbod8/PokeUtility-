package models;

public class Values {
  private int hitPoints;
  private int attack;
  private int defense;
  private int specialAttack;
  private int specialDefense;
  private int speed;

  public Values(int hitPoints, int attack, int defense, int specialAttack, int specialDefense, int speed) {
    this.hitPoints = hitPoints;
    this.attack = attack;
    this.defense = defense;
    this.specialAttack = specialAttack;
    this.specialDefense = specialDefense;
    this.speed = speed;
  }

  public Values(int[] values) throws ArrayIndexOutOfBoundsException {
    this.hitPoints = values[0];
    this.attack = values[1];
    this.defense = values[2];
    this.specialAttack = values[3];
    this.specialDefense = values[4];
    this.speed = values[5];
  }

  public int getHitPoints() {
    return this.hitPoints;
  }

  public int getAttack() {
    return this.attack;
  }

  public int getDefense() {
    return this.defense;
  }

  public int getSpecialAttack() {
    return this.specialAttack;
  }

  public int getSpecialDefense() {
    return this.specialDefense;
  }

  public int getSpeed() {
    return this.speed;
  }
}