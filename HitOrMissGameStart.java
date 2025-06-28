public class HitOrMissGameStart {

    private static final GameHelper gameHelper = new GameHelper();

    public static void main(String[] args) {
        int random = (int)(Math.random() * 5);
        int[] locations = {random, random+1, random+2};
        int numOfGuesses = 0;
        Grid grid = new Grid(locations);
        boolean isAlive = true;

        while (isAlive) {
            String index = gameHelper.getUserInput("Please Enter Number: ");
            String res = grid.checkYourself(index);
            numOfGuesses++;
            if (res.equals("Kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}