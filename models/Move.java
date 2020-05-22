package models;

/**
 * Write a description of class Move here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Move extends Typed {
  public Kind kind;
  public String name;
  public int multiplier;

  public Move(String name, Type primaryType, Type secondaryType) {
    super(name, primaryType, secondaryType);
  }

  public Kind getKind() {
    return this.kind;
  }

}
