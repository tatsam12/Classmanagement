package Model;

import java.util.ArrayList;

public class Teams {
    public Teams(String name, ArrayList<Model.Students> students) {
        this.name = name;
        Students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Model.Students> getStudents() {
        return Students;
    }

    public void setStudents(ArrayList<Model.Students> students) {
        Students = students;
    }

    String name;

    ArrayList<Students> Students;

}