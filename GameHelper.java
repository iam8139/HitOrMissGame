import java.io.*;

public class GameHelper {
    public String getUserInput(String prompt) {
        System.out.println(prompt + "   ");
        String input = "";
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            input = is.readLine();
            if (input.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }

        return input;
    }
}