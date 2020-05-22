package models;

/**
 * Write a description of class Pokemon here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pokemon extends Typed {
  private int level;
  private Values effortValues;
  private Values individualValues;
  private Values baseValues;

  public Pokemon(String name, Type primaryType, Type secondaryType, int level, Values effortValues,
      Values individualValues, Values baseValues) {
    super(name, primaryType, secondaryType);
    this.level = level;
    this.effortValues = effortValues;
    this.individualValues = individualValues;
    this.baseValues = baseValues;
  }

  public int useMove(Move move, int level) {
    return 0;
  }

  public int getStat(Statistic stat) {
    double nature = 1.0;
    if (stat == Statistic.HEALTH) {
      return (int) Math.floor((((2 * this.baseValues.getHitPoints() + this.individualValues.getHitPoints() + (this.effortValues.getHitPoints() / 4)) * this.level) / 100) + this.level + 10);
    } else if (stat == Statistic.ATTACK) {
      return (int) Math.floor(((((2 * baseValues.getAttack() + individualValues.getAttack() + (effortValues.getAttack() / 4)) * this.level) / 100) + 5) * nature);
    } else {
      return 0;
    }
  }
}
