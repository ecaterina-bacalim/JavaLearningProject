package md.tekwillacademy.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    public static Random random = new Random();

    public static int generateRandomInt (int limit){
         return random.nextInt(limit);

        // sau
        // int randomInt = random.nextInt(limit);
        // return randomInt;

    }

    public static int generateRandomInt (int min, int max) {
        int randomNumber;
        if (min < max) {
            randomNumber = random.nextInt(min, max);
        } else {
            randomNumber = min;
        }

        return randomNumber;
    }

    public static String returnRandomString (String domain){

        String uuid = UUID.randomUUID().toString();
        return uuid + "@" + domain;
    }

    public static String returnRandomString (){
        String uuid = UUID.randomUUID().toString();
         return uuid + "@mail.ru";
    }

}
