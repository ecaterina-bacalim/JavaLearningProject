package md.tekwillacademy.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileTaskExecution {
    public static void main(String[] args) throws IOException {
        File object01 = new File ("src/main/java/md/tekwillacademy/filemanagementservice/fisier.txt");


        FileManager.informIfTheTheFileExists(object01);
        System.out.println(FileManager.createTheFileIfItDoesNotExist(object01));
        FileManager.informIfTheTheFileExists(object01);

        FileManager.printTheFileName(object01);
        FileManager.printTheFileAbsolutePath(object01);
        FileManager.printIfTheFileIsADirectory(object01);

        System.out.println("Object02 actions start here");
        File object02 = new File ("src/main/java/md/tekwillacademy/filemanagementservice/fisier2.txt");
        System.out.println(FileManager.createTheFileIfItDoesNotExist(object02));
        FileManager.deleteTheFileIfExists(object02);
        FileManager.deleteTheFileIfExists(object01);

        System.out.println();

        String path = "src/main/java/md/tekwillacademy/filemanagementservice/writedata.txt";
        OutputFileWriterManager.writeContentIntoFileUsingFileWriter(path, "Content 1");
        OutputFileWriterManager.writeContentIntoFileUsingFileWriter(path, "Content 2");
        OutputFileWriterManager.writeContentIntoFileUsingBufferWriter(path, "Content 3");

        InputFileReadManager.printDataFromAFile(path);
        InputFileReadManager.printDataFromAFileUsingFileReader(path);
        InputFileReadManager.printDataFromAFileUsingBufferReader(path);



    }
}
