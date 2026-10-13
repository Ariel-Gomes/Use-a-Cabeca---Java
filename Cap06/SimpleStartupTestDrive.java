package Cap04;
import java.util.ArrayList;

public class SimpleStartupTestDrive {
    public static void main(String[] args){
        Startup dot = new Startup();

        ArrayList<String> locations = new ArrayList<String>();
        locations.add(Integer.toString(2));
        locations.add(Integer.toString(3));
        locations.add(Integer.toString(4));
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);

        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}
