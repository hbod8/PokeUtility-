import models.*;

/**
 * Write a description of class test here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class test {
  public static void main(String[] args) {
    Values baseStats = new Values(108, 0, 0, 0, 0, 0);
    Values evs = new Values(74, 0, 0, 0, 0, 0);
    Values ivs = new Values(24, 0, 0, 0, 0, 0);
    Pokemon garchomp = new Pokemon("Garchomp", Type.DRAGON, Type.GROUND, 78, evs, ivs, baseStats);
    System.out.println(garchomp.getDescription() + " with health " + garchomp.getStat(Statistic.HEALTH));
  }
}
