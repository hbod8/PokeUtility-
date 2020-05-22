
/**
 * Write a description of class Move here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Move implements Entry
{
    public Type primaryType;
    public Type secondaryType;
    public Kind kind;
    public String name;
    public int multiplier;
    public Move(String name, Type primaryType, Type secondaryType)
    {
        this.name = name;
        this.primaryType = primaryType;
        this.secondaryType = secondaryType;
    }
    public Type getPrimaryType()
    {
        return this.primaryType;
    }
    public Type getSecondaryType()
    {
        return this.secondaryType;
    }
    public Kind getKind()
    {
        return this.kind;
    }
    public String getName()
    {
        return this.name;
    }
}
