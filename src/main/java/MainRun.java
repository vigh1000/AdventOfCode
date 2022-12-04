import java.io.File;
import java.io.FileNotFoundException;

public class MainRun {

    public static void main(String args[]) throws FileNotFoundException {
        File input = new File("src/main/resources/DayOneInput");
        DayGeneral ProblemOfTheDay = new DayOne(input);
        System.out.println(ProblemOfTheDay.returnResult());
    }
}
