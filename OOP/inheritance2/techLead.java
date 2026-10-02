package OOP.inheritance2;


//example of multiple inheritance
public class techLead extends Employee implements TeamLead, ProjectManager{
    private int teamSize;
    private String project;

    public techLead(int age, String name, int teamSize, String project) {
        super(age, name);
        this.teamSize = teamSize;
        this.project = project;
    }

    void getInfo(){
        display();
        manageProject();
        leadTeam();
    }


    @Override
    public void manageProject() {
        System.out.println("project manager");
    }

    @Override
    public void leadTeam() {
        System.out.println("team leader");

    }


    public String getProject() {
        return project;
    }

    public int getTeamSize() {
        return teamSize;
    }




}
