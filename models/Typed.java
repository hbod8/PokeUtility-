package models;

/**
 * Write a description of interface Entry here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Typed {
  private Type primaryType;
  private Type secondaryType;
  private String name;

  protected Typed(String name, Type primaryType, Type secondaryType) {
    this.name = name;
    this.primaryType = primaryType;
    this.secondaryType = secondaryType;
  }

  public Type getPrimaryType() {
    return this.primaryType;
  }

  public Type getSecondaryType() {
    return this.secondaryType;
  }

  public String getName() {
    return this.name;
  }

  public String getDescription() {
    return "" + getName() + " with primary type " + getPrimaryType() + " and secondary type " + getSecondaryType();
  }
}
