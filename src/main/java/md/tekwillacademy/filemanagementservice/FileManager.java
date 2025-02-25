package md.tekwillacademy.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {
    public static boolean createTheFileIfItDoesNotExist(File file) {
        try {
            return file.createNewFile();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }


    public static void informIfTheTheFileExists(File file){
        if (file.exists()) {
            System.out.println("The file already exists");
        } else {
            System.out.println("The file doesn't exist");
        }
    }

    public static void printTheFileName(File file){
        System.out.println(file.getName());
    }

    public static void printTheFileAbsolutePath (File fileInput){
        System.out.println(fileInput.getAbsolutePath());
    }

    public static void printIfTheFileIsADirectory(File file){
        System.out.println(file.isDirectory());
    }

    public static void deleteTheFileIfExists(File file){
        if (file.exists()) {
              System.out.println("The file was deleted: " + file.delete());
        } else {
            System.out.println("The file was not deleted");
        }
    }

}
