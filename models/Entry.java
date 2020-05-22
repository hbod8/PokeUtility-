package models;

/**
 * Write a description of interface Entry here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Entry {
  public Type getPrimaryType();

  public Type getSecondaryType();

  public String getName();

  default public String getDescription() {
    return "" + getName() + " with primary type " + getPrimaryType() + " and secondary type " + getSecondaryType();
  }
}
