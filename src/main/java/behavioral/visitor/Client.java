package behavioral.visitor;

public abstract class Client {
    private String name;
    private Integer age;

    public Client(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Client() {
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

    public abstract void accept(Visitor visitor);
}
