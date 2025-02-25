package md.tekwillacademy.exceptionsservicetask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class ArithmeticOperationService {
    public static double divideWithoutException (int a, int b) {
        return a/b;
    }
    public static double divideWithException (int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException captureException){
            System.out.println( captureException.getMessage());
        }
        return 0;
    }

}
