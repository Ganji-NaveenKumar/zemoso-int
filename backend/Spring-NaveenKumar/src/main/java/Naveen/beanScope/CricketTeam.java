package Naveen.beanScope;


public class CricketTeam {
    private final Team team;
    public CricketTeam(Team team) {
        this.team=team;
    }
    public String getTeam() {
      return  team.display();
    }
}
