import java.util.HashMap;
import java.util.Set;
public class Room 
{
    public String description;
    private HashMap<String, Room> exits;

    
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<>();
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param direction :
     *  north The north exit.
     *  east The east east.
     *  south The south exit.
     *  west The west exit.
     */
    public void setExits(String direction,Room neighbour) 
    {
       exits.put(direction, neighbour);
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    
    public Room getExit(String direction)
    {
       return exits.get(direction);
    }
    
    public String getLongDescription(){
    
    return ("you are" + description + ".\n" + getExitString());
    
    }
    
    public String getExitString()
    {
     String returnString = "";
     Set<String> keys = exits.keySet();
     for(String exit: keys)
     {
        returnString += " " + exit;
     }
    
    return returnString;
}
   
}
