/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 * 
 * This class holds an enumeration of all command words known to the game.
 * It is used to recognise commands as they are typed in.
 *
 */
import java.util.HashMap;

public class CommandWords
{
    // a constant array that holds all valid command words
     private HashMap<String, CommandWord> validCommands;
   

    /**
     * Constructor - initialise the command words.
     */
    public CommandWords()
    {
        validCommands = new HashMap<>();
        validCommands.put("go",CommandWord.GO); 
        validCommands.put("help",CommandWord.HELP);
        validCommands.put("quit",CommandWord.QUIT);
        
        
    }
    
    public CommandWord getCommandWord(String key)
    {
        if(isCommand(key))
            return validCommands.get(key);
        else
            return CommandWord.UNKNOWN;
    }

    /**
     * Check whether a given String is a valid command word. 
     * @return true if a given string is a valid command,
     * false if it isn't.
     */
    public boolean isCommand(String aString)
    {
        //
        //if(validCommands.containsKey(aString) == false){}
        if(validCommands.get(aString) == null || validCommands.get(aString) == CommandWord.UNKNOWN)
            return false;
        
        /*for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }*/
        // if we get here, the string was not found in the commands
        return true;
    }
    
    
    public void showAll()
    {
       
        for(String command : validCommands.keySet()){
            
            System.out.print(command + " ");
       
        }
        System.out.println();
    
    }
}
