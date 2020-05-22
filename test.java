import models.*;

/**
 * Write a description of class test here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class test {
  public static void main(String[] args) {
    Pokemon garchomp = new Pokemon("Garchomp", Type.DRAGON, Type.GROUND, new int[] { 74 }, new int[] { 24 }, 108, 0, 0,
        0, 0, 0);
    System.out.println(garchomp.getDescription() + " with health " + garchomp.getStat(Statistic.HEALTH, 78));
  }
}
