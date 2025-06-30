import java.util.*;
public class Grid {
    private ArrayList<String> locations;
    private String name;
    public Grid(String name) {
        this.name = name;
    }

    public void setLocations(ArrayList<String> locations) {this.locations=locations;}
    public String checkYourself(String position) {
        int loc = locations.indexOf(position);
        String res = "Miss";
        if (loc >= 0) {
            locations.remove(loc);

            if (locations.isEmpty()) {
                res = "Kill";
                System.out.println("Ouch! you sunk " + this.name + " : (");
            } else {
                res = "Hit";
            }
        }

        System.out.println(res);
        return res;
    }
}