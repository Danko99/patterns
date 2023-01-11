package creational.prototype;

public class ClientProject {
    public static void main(String[] args) throws CloneNotSupportedException {
        Project project = new Project(1,"vasya","123sda");
        Project copy =(Project) project.copy();
        System.out.println(project==copy); //false

        String projectName = project.getProjectName();

        String projectNameCopy = copy.getProjectName();

        System.out.println(projectName==projectNameCopy);//true
    }
}
