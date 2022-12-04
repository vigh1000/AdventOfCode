import java.io.File;
import java.io.FileNotFoundException;

public class MainRun {

    public static void main(String args[]) throws FileNotFoundException {
        File input = new File("src/main/resources/DayTwoInput");
        DayGeneral ProblemOfTheDay = new DayTwo(input);
        System.out.println(ProblemOfTheDay.returnResult());
    }
}
