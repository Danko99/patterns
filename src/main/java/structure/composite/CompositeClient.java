package structure.composite;

public class CompositeClient {
    public static void main(String[] args) {
        Folder folder = new Folder("folder1", null);
        folder.addFolderToFolderList(new Folder("folder2", null));

        System.out.println(folder);
    }
}
