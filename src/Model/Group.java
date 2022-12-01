package Model;

import java.util.ArrayList;

public class Group {


    String name;

    public Group(String name, ArrayList<Teams> teamsArraylist) {
        this.name = name;
        TeamsArraylist = teamsArraylist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Teams> getTeamsArraylist() {
        return TeamsArraylist;
    }

    public void setTeamsArraylist(ArrayList<Teams> teamsArraylist) {
        TeamsArraylist = teamsArraylist;
    }

    ArrayList<Teams> TeamsArraylist;

}
