package creational.builder;

public class Person {
    private String name;
    private Integer age;
    private String surname;

    public Person(String name, Integer age, String surname) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private String name;
        private Integer age;
        private String surname;

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Person build() {
            return new Person(name, age, surname);
        }

    }
}
