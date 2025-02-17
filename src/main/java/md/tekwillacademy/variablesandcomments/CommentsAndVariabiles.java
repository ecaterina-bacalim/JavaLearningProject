package md.tekwillacademy.variablesandcomments;

import java.util.Arrays;

public class CommentsAndVariabiles {
    public static void main(String[] args) {
        boolean isHotOutside;
        isHotOutside = true;
        System.out.println("Is it hot outside: "+ isHotOutside);
        boolean isItFriday = false;
        System.out.println("Is it Friday: " + isItFriday);

        //Declaration of the variables

        char firstCharFromAscii;
        char lastCharFromAscii;
        byte lowerLimitOfByte;
        byte upperLimitOfByte;
        short lowerLimitOfShort;
        short upperLimitOfShort;
        int lowerLimitOfInt;
        int upperLimitOfInt;
        long lowerLimitOfLong;
        long upperLimitOfLong;
        float lowerLimitOfFloat;
        float upperLimitOfFloat;
        double lowerLimitOfDouble;
        double upperLimitOfDouble;

//Initialisation of the variables
        firstCharFromAscii = 'A';
        lastCharFromAscii = 'Z';
        lowerLimitOfByte = -128;
        upperLimitOfByte = 127;
        lowerLimitOfShort = -32768;
        upperLimitOfShort = 32767;
        lowerLimitOfInt = -2147483648;
        upperLimitOfInt = -2147483647;
        lowerLimitOfLong = -9223372036854775808L;
        upperLimitOfLong = 9223372036854775807L;
        lowerLimitOfFloat = -3.4E+38F;
        upperLimitOfFloat = 3.4E+38F;
        lowerLimitOfDouble = -1.7E+308D;
        upperLimitOfDouble = 1.7E+308D;

        /**
         * Show out the variables values
       * int age = 25;
       * String name = "Alice";
       * double height = 5.7;
       * System.out.println("Name: " + name + ", Age: " + age + ", Height: " + height);*/

        System.out.println ("firstCharFromAscii: " + firstCharFromAscii + ", firstCharFromAscii: " + lastCharFromAscii + ",  lowerLimitOfByte:" +  lowerLimitOfByte + ", upperLimitOfByte:" + upperLimitOfByte + ", lowerLimitOfShort:" + lowerLimitOfShort + ", upperLimitOfShort" + upperLimitOfShort);
        System.out.println("lowerLimitOfInt:" + lowerLimitOfInt);
        System.out.println("upperLimitOfInt: " + upperLimitOfInt);
        System.out.println("lowerLimitOfLong: " + lowerLimitOfLong + "upperLimitOfLong: " + upperLimitOfLong);
        System.out.println("lowerLimitOfFloat: " + lowerLimitOfFloat + ", upperLimitOfFloat: " + upperLimitOfFloat);
        System.out.println("lowerLimitOfDouble: " + lowerLimitOfDouble + ", lowerLimitOfDouble: " + lowerLimitOfDouble);
    }
}
