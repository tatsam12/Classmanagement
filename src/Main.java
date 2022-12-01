import Model.Group;
import Model.Students;
import Model.Teams;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Students s1 = new Students("Ankit",23033,16);
        Students s2 = new Students("Aswin",23012,17);
        Students s3 = new Students("Biplov",23011,17);
        Students s4 = new Students("Asim",23014,17);
        Students s5 = new Students("Avarna",23015,17);
        Students s6 = new Students("Asharaya",23016,17);
        Students s7 = new Students("Ashutosh",23017,17);
        Students s8 = new Students("Pranjal",23019,17);
        Students s9 = new Students("Tatsam",23045,17);
        Students s10 = new Students("Aaditya",23001,17);
        Students s11 = new Students("Sushant",23046,17);
        Students s12 = new Students("Abhinav",23010,17);
        Students s13 = new Students("Ishan",23056,17);
        Students s14 = new Students("Prasoon",23034,17);
        Students s15 = new Students("Subham",23052,17);

        ArrayList<Students>Team1Students = new ArrayList<>();
        Team1Students.add(s1);
        Team1Students.add(s2);
        Team1Students.add(s3);
        Team1Students.add(s4);
        Team1Students.add(s5);
        ArrayList<Students>Team2Students = new ArrayList<>();
        Team2Students.add(s6);
        Team2Students.add(s7);
        Team2Students.add(s8);
        Team2Students.add(s9);
        Team2Students.add(s10);
        ArrayList<Students>Team3Students = new ArrayList<>();
        Team3Students.add(s11);
        Team3Students.add(s12);
        Team3Students.add(s13);
        Team3Students.add(s14);
        Team3Students.add(s15);

        ArrayList<Teams> Team1= new ArrayList<>();
        ArrayList<Teams> Team2= new ArrayList<>();
        ArrayList<Teams> Team3= new ArrayList<>();
        ArrayList<Teams> Team4= new ArrayList<>();

        Teams myteam1 = new Teams("Team1",Team1Students);
        Teams myteam2 = new Teams("Team1",Team2Students);
        Teams myteam3 = new Teams("Team1",Team3Students);

        Group g1 = new Group("A",Team1);
        Group g2 = new Group("A",Team2);
        Group g3 = new Group("A",Team3);













    }
}