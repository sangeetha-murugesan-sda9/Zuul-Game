
/**
 * Enumeration class CommandWord - description of the enum class
 *
 */
public enum CommandWord
{
    GO("go"), QUIT("quit"), HELP("help"), UNKNOWN("?");
    
    private String CommandString;
    
    CommandWord(String commandstring)
    {
    
    this.CommandString = commandstring;
    }
    
    
    public String toString()
    {
    
     return CommandString;
    }
        
}
