package md.tekwillacademy.accessmodifiers.peopleevidence;

public class Person {
    public static String nationality = "MDA";
    public String name;
    protected String gender;
    int age;
    public int phoneNumber;

    public Person (String nameInput, String genderInput, int ageInput, int phoneNumberInput){
        name = nameInput;
        gender = genderInput;
        age  = ageInput;
        phoneNumber = phoneNumberInput;
    }

    public Person (String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    public Person () {}

    public int getAge() {
        return age;
    }

    public String getGender () {
        return gender;
    }
}
