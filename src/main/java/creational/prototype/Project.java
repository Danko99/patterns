package creational.prototype;

public class Project implements Copyable {
    private Integer id;
    private String projectName;
    private String sourceCode;

    public Project(Integer id, String projectName, String sourceCode) {
        this.id = id;
        this.projectName = projectName;
        this.sourceCode = sourceCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @Override
    public Object copy() throws CloneNotSupportedException {
        return super.clone();
    }
}
