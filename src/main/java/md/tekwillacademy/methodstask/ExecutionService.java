package md.tekwillacademy.methodstask;

public class ExecutionService {
    public static void main(String[] args) {

    Customer marcelCustomer = new Customer();


    marcelCustomer.setId(123);
    marcelCustomer.setName("Marcel");
    marcelCustomer.setAge(DataGeneratorUtil.generateRandomInt(115));
    marcelCustomer.setAddress("Buiucani");

    Customer ionelCustomer = new Customer(990, "Ionel", "Ciocana 123");

    ionelCustomer.setId(124);
    ionelCustomer.setAge(DataGeneratorUtil.generateRandomInt(115));
    ionelCustomer.setName("Ionut");
    ionelCustomer.setAddress("Ciocana");

        System.out.println("ID: " + marcelCustomer.getId()+ "   Name: "+ marcelCustomer.getName() + "   Address: "+marcelCustomer.getAddress()+ "   Age: " + marcelCustomer.getAge());
        System.out.println("ID: " + ionelCustomer.getId() + "   Age: "+ ionelCustomer.getAge());


        System.out.println(DataGeneratorUtil.generateRandomInt(20));
        System.out.println(DataGeneratorUtil.generateRandomInt(200));

        System.out.println("Random Generator min/max: "+ DataGeneratorUtil.generateRandomInt(11,10));

        System.out.println("email uuid: "+ DataGeneratorUtil.returnRandomString("gmail.com"));
        System.out.println("email content: "+ DataGeneratorUtil.returnRandomString());

    }
}
