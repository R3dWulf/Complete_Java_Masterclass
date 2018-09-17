import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String locationDescription;
    private final Map<String, Integer> exits;

    public Location(int locationID, String locationDescription, Map<String, Integer> exitsParam) {
        this.locationID = locationID;
        this.locationDescription = locationDescription;
        if( exitsParam != null)  // if exitsParam is null, program will crash
        {
            this.exits = new HashMap<String, Integer>(exitsParam);
        }
        else
        {
            this.exits = new HashMap<String, Integer>();
        }
      this.exits.put("Q", 0);
    }

//    public void addExit(String directionParam, int locationParam)
//    {
//        exits.put(directionParam, locationParam);
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
