public class HitOrMissGameTestDrive {
    public static void main(String[] args) {
        int[] locations = {2,3,4};
        Grid grid = new Grid(locations);
        String result = grid.checkYourself("2");
        if (result.equals("Hit")) System.out.println("Result: " + result);
        if (grid.checkYourself("1").equals("Miss")) System.out.println("Checking 1: " + grid.checkYourself("1"));

        System.out.println("Checking 3: " + grid.checkYourself("3"));
        String res = grid.checkYourself("4");
        if (res.equals("Kill")) System.out.println("Final Result: " + res);
    }
}