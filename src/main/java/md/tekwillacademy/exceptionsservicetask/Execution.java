package md.tekwillacademy.exceptionsservicetask;

import java.io.FileNotFoundException;

public class Execution {
    public static void main(String[] args)  {
        try {
            TextManager.readDataWithoutCatchAndTry("Stas");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}
