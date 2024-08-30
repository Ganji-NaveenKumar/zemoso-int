package Naveen.beanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        CricketTeam cricketTeam =context.getBean("cricketTeam", CricketTeam.class);
        System.out.println(cricketTeam.getTeam());
        Cricket cricket =context.getBean("cricket", Cricket.class);
        System.out.println(cricket.toString());

        Cricket cricket2 =context.getBean("cricket", Cricket.class);
        System.out.println(cricket2==cricket);


        Team team = context.getBean("team", Team.class);
//        System.out.println(team);
        Team team1 =context.getBean("team", Team.class);
        System.out.println(team1==team);

        Player player=context.getBean("player", Player.class);
        player.setName("naveen");
       System.out.println(player);
        context.close();
    }
}
