import java.util.*;

public class Grid {
    private int[] locations;
    private int counter = 0;

    public Grid(int[] locations) {
        this.locations = locations;
    }

    public String checkYourself(String position) {
        int pos = Integer.parseInt(position);
        String res = "Miss";
        for (int loc : locations) {
            if (loc == pos) {
                res = "Hit";
                counter++;
                break;
            }
        }

        if (counter == locations.length) {
            res = "Kill";
        }

        System.out.println(res);
        return res;
    }
}