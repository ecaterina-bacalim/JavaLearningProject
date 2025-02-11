package md.tekwillacademy.accessmodifiers;

import md.tekwillacademy.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceService {
    public static void main(String[] args) {

        Person ionelBaiatGrozav = new Person();
        Person marcelBoy = new Person("Marcel Bivol", "Male", 36, 1234567);

        ionelBaiatGrozav.name = "Ionel Bostanel";
        marcelBoy.name = "Marcel Bivol";

        Person raisaPacalo = new Person("Raisa Pacalo", "Female");
        System.out.println(raisaPacalo.name);
        System.out.println(raisaPacalo.getGender());


        System.out.println(marcelBoy.getAge());
        System.out.println(ionelBaiatGrozav.getAge());

        System.out.println(Person.nationality);
        Person.nationality = "Moldovean Editat";
        System.out.println(Person.nationality);

    }
}
