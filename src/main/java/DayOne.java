import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayOne extends DayGeneral {

    public DayOne (File inputFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(inputFile);

        int mostCalories = 0;
        int sumCurrentCalories = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isBlank()) {
                if (sumCurrentCalories > mostCalories) mostCalories = sumCurrentCalories;
                sumCurrentCalories = 0;
                continue;
            }
            sumCurrentCalories += Integer.parseInt(line);
        }
        result = String.valueOf(mostCalories);
    }
}
