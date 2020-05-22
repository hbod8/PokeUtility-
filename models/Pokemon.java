package models;
/**
 * Write a description of class Pokemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pokemon implements Entry
{
    public Type primaryType;
    public Type secondaryType;
    public String name;
    public int[] effortValues;
    public int[] individualValues;
    public int baseHealth;
    public int baseAttack;
    public int baseDefense;
    public int baseSpecialAttack;
    public int baseSpecialDefense;
    public int baseSpeed;
    public Pokemon(String name, Type primaryType, Type secondaryType, int[] ev, int[] iv, int baseHealth, int baseAttack, int baseDefense, int baseSpecialAttack, int baseSpecialDefense, int baseSpeed)
    {
        this.name = name;
        this.primaryType = primaryType;
        this.secondaryType = secondaryType;
        this.effortValues = ev;
        this.individualValues = iv;
        this.baseHealth = baseHealth;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
        this.baseSpecialAttack = baseSpecialAttack;
        this.baseSpecialDefense = baseSpecialDefense;
        this.baseSpeed = baseSpeed;
    }
    public Type getPrimaryType()
    {
        return this.primaryType;
    }
    public Type getSecondaryType()
    {
        return this.secondaryType;
    }
    public String getName()
    {
        return this.name;
    }
    public int useMove(Move move, int level) {
        return 0;
    }
    public int getHealth(int level)
    {
        return (int) Math.floor((((2 * baseHealth + individualValues[0] + (effortValues[0] / 4)) * level) / 100) + level + 10);
    }
    public int getStat(Statistic stat, int level)
    {
        double nature = 1.0;
        if (stat == Statistic.HEALTH)
        {
            return (int) Math.floor((((2 * baseHealth + individualValues[0] + (effortValues[0] / 4)) * level) / 100) + level + 10);
        }
        else if (stat == Statistic.ATTACK)
        {
            return (int) Math.floor(((((2 * baseHealth + individualValues[0] + (effortValues[0] / 4)) * level) / 100) + 5) * nature);
        }
        else
        {
            return 0;
        }
    }
}
