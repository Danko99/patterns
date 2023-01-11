package creational.builder;

public class ClientPerson {
    public static void main(String[] args) {
        Person.PersonBuilder builder = new Person.PersonBuilder();


        Person person = builder
                .setAge(25)
                .setName("Vasya")
                .setSurname("Pupkin")
                .build();


        System.out.println(person);

    }
}
