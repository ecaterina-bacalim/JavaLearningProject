package md.tekwillacademy.exceptionsservicetask;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args)  {
        System.out.println(TextManager.getTheTextLength("mama"));
        System.out.println(TextManager.getTheTextLengthWithTryAndCatch(null));
        System.out.println(TextManager.getTheTextLength("tata1"));
        System.out.println(TextManager.getTheTextLengthWithTryAndCatch("Rodica"));

        TextManager.readDataWithTryAnCatch("file.txt");

        try {
            TextManager.readDataWithoutCatchAndTry("text.text");
        } catch (FileNotFoundException exception){
            exception.printStackTrace();
        }

        System.out.println("Last Line");

        System.out.println(ArithmeticOperationService.divideWithException(10, 0));
        System.out.println("The show must go on");
    }
}
