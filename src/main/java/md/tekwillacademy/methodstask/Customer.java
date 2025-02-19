package md.tekwillacademy.methodstask;

public class Customer {

    private int  id;
    private String name;
    private int age;
    private String address;

    public Customer (int id, String name, String address){
        this.id= id;
        this.name = name;
        this.address = address;

    }

    public Customer (){}
//Setter
    public void setId(int idFormalParam) {
        id = idFormalParam;
    }

    public void setName(String name){
        this.name = name;
    }
    public  void setAge (int ageInput){
        if ((ageInput > 0) && (ageInput <=115)){
           age = ageInput;
        } else {
            System.out.println("The property is not valid. please enter another value for Age");
        }

    }
    public void setAddress (String address) {
        this.address = address;
    }
//Getter
    public int getId () {
        return this.id;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

}
