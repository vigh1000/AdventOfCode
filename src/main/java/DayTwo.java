import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DayTwo extends DayGeneral {
    //https://adventofcode.com/2022/day/2

    HashMap<String,Integer> resultTable = new HashMap<>();

    public DayTwo(File inputFile) throws FileNotFoundException {
        fillResultTable();
        Scanner scanner = new Scanner(inputFile);
        int totalScore = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            totalScore += resultTable.get(line);
        }
        result = String.valueOf(totalScore);
    }

    void fillResultTable(){
        resultTable.put("A X", 4);
        resultTable.put("A Y", 8);
        resultTable.put("A Z", 3);
        resultTable.put("B X", 1);
        resultTable.put("B Y", 5);
        resultTable.put("B Z", 9);
        resultTable.put("C X", 7);
        resultTable.put("C Y", 2);
        resultTable.put("C Z", 6);
    }
}
