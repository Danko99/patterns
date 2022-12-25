package structure.composite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Folder {
    private String name;
    private Date dateOfCreation;
    private final List<Folder> folderList;

    public Folder() {
        folderList = new ArrayList<>();
    }

    public Folder(String name, Date dateOfCreation) {
        this.name = name;
        this.dateOfCreation = dateOfCreation;
        folderList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Folder getElementOfFolderList(Integer index) {
        return folderList.get(index);
    }

    public void addFolderToFolderList(Folder folder) {
        folderList.add(folder);
    }

    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                ", folderList=" + folderList +
                '}';
    }
}
