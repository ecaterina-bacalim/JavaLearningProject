package md.tekwillacademy.filemanagementservice;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class InputFileReadManager {
    public static void printDataFromAFile(String file){
        try {
            System.out.println(Files.readString(Path.of(file)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printDataFromAFileUsingFileReader(String filePath) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
            int charNumber = 0;
            while ((charNumber = fileReader.read()) != -1) {
                System.out.print((char) charNumber);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                    System.out.println();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }


    public static void printDataFromAFileUsingBufferReader(String filePath) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.print(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
