package projectmanager;

public class Project {
    String name;
    Integer id;
    String notes;

    public Project(String name, Integer id){
        this.name = name;
        this.id = id;
    }

    public Project(String name, Integer id, String notes){
        this.name = name;
        this.id = id;
        this.notes = notes;
    }
}
