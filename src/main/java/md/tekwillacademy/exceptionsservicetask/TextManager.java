package md.tekwillacademy.exceptionsservicetask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class TextManager {
    public static int getTheTextLength(String text){
        return text.length();
    }

    public static int getTheTextLengthWithTryAndCatch (String text) {
        try {
            return text.length();
        } catch (NullPointerException exceptionObject){
            System.out.println("This is an exception " + exceptionObject.getMessage());
            return 0;
        }finally {
            System.out.println("This block is executed each time");
        }
    }
    public static void readDataWithTryAnCatch (String fileName) {
        try{
            FileReader fileReader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Continuam executona, insa afisam mesajul stocal in obiectul capturat: " + e.getMessage());
        }

                System.out.println("FileReader was created ");
    }
public static void readDataWithoutCatchAndTry (String fileName) throws FileNotFoundException {
    FileReader fileReader = new FileReader(fileName);
    System.out.println("Metoda a fost executata");
}

}
