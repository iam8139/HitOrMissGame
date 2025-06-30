import java.util.*;
public class Grid {
    private ArrayList<String> locations;
    public Grid(ArrayList<String> locations) {
        this.locations = locations;
    }
    public String checkYourself(String position) {
        int loc = locations.indexOf(position);
        String res = "Miss";
        if (loc >= 0) {
            locations.remove(loc);

            if (locations.isEmpty()) {
                res = "Kill";
            } else {
                res = "Hit";
            }
        }

        System.out.println(res);
        return res;
    }
}