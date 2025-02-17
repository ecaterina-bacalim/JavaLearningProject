package md.tekwillacademy.operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        // sum of the odd numbers from 0 to 1000

        int totalSum = 0;

        for (int iterator = 0; iterator <= 1000; iterator++) {
            if (iterator % 2 == 1) {
                totalSum += iterator;
                //totalSum = totalSum + iterator;
                System.out.println("Interator: " + iterator);
                System.out.println("Total sum: " + totalSum);
            }
        }
        System.out.println("Total of total sum: " + totalSum);

        for (int i = 1; i<=10; i+=2)
            System.out.println("i: " + i);


        int a = 1;
        for (; a <= 15; a ++) {
            System.out.print("a: " + a + ", ");
        }

        System.out.println();
        int b = 1;
        for (; b<=a; ){
            System.out.print("b: "+ b+ ", ");
            b+=2;
        }

    }
}
