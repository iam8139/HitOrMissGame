import java.util.*;
public class HitOrMissGameStart {
    private static final GameHelper gameHelper = new GameHelper();
    private ArrayList<Grid> grids = new ArrayList<>(3);
    private int numbOfGuesses = 0;
    
    private void setUpGame() {
        Grid grid1 = new Grid("Pets.com");
        Grid grid2 = new Grid("eToys.com");
        Grid grid3 = new Grid("Go.com");
        grids.add(new Grid("Pets.com"));
        grids.add(new Grid("eToys.com"));
        grids.add(new Grid("Go.com"));

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (Grid grid : grids) {
            ArrayList<String> newLocation = gameHelper.placeDotCom(3);
            grid.setLocations(newLocation);
        }
    }

    private void startPlaying() {
        while(!grids.isEmpty()) {
            String userGuess = gameHelper.getUserInput("Enter a Guess");
            checkUserGuess(userGuess);
        }

        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numbOfGuesses++;
        String result = "miss";
        for (int i = 0; i < grids.size(); i++) {
            result = grids.get(i).checkYourself(userGuess);
            if (result == "Hit") break;
            else if (result == "Kill") {
                grids.remove(i);
                break;
            }
        }

        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numbOfGuesses <= 18) {
            System.out.println("It only took you " + numbOfGuesses + " guesses.");
            System.out.println(" You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. "+ numbOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    }
    public static void main(String[] args) {
        HitOrMissGameStart game = new HitOrMissGameStart();
        game.setUpGame();
        game.startPlaying();
        game.finishGame();
    }
}