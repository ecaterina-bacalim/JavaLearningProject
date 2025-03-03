package md.tekwillacademy.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class LibraryMafiaService {
    public static void main(String[] args) {
        Library carturesti001 = new Library("Carturesti");
        System.out.println("Total Number of books at Carturesti: "+carturesti001.getTheNumberOfBooksInTheStock());

        Book prichindelBook001 = new Book("Prichindel1", "Spiridon Vanghele");
        Book prichindelBook002 = new Book("Prichindel2", "Spiridon Vanghele");
        Book prichindelBook003 = new Book("Prichindel3", "Spiridon Vanghele");

        carturesti001.addBook(prichindelBook002);
        carturesti001.addBook(prichindelBook003);
        carturesti001.addBook(prichindelBook002);
        System.out.println("Total Number of books at Carturesti: "+carturesti001.getTheNumberOfBooksInTheStock());
        System.out.println("IS book present in the stock: "+ carturesti001.isBookPresent(prichindelBook002));

        carturesti001.printBookTitle();
        System.out.println();


        Library librarius002 = new Library("Librarius");
        Book poorDadReachDad = new Book("Poor Dad Reach Dad", "Robert Q");

        librarius002.addBook(poorDadReachDad);
        librarius002.addBook(prichindelBook001);


        System.out.println("Total Number of books at Librarius: "+librarius002.getTheNumberOfBooksInTheStock());
        System.out.println("IS book present in the stock: "+ librarius002.isBookPresent(prichindelBook001));
        librarius002.printBookTitle();

        Map<String, Library> lanturiDeLibrarii = new HashMap();

        lanturiDeLibrarii.put("Arborilor 21", carturesti001);
        lanturiDeLibrarii.put("Uzinelor 2/4", librarius002);
        for (Map.Entry<String, Library> dataSet: lanturiDeLibrarii.entrySet() ) {
            System.out.println("The key is" + dataSet.getKey());
            System.out.println("The value is");
            dataSet.getValue().printBookTitle();
        }
    }
}
