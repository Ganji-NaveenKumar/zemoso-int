package Naveen.beanScope;

public class Player {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
    public void startMethod(){
        System.out.println();
        System.out.println("Executes when bean initialized - Player ");
        System.out.println();
    }
    public void endMethod(){
        System.out.println("Executes when bean destroyed");
    }
}
