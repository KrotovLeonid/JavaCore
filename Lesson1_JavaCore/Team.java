package Lesson1_JavaCore;

public class Team implements Competitor {
    String teamName;

    String type;
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean onDistance;

    public Team(String teamName, Competitor competitors0,Competitor competitors1,Competitor competitors2,Competitor competitors3){
        Competitor[] competitors ={competitors0, competitors1, competitors2, competitors3};
    }


    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " хорошо справился с кроссом");
        } else {
            System.out.println(type + " " + name + " не справился с кроссом");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {

    }

    @Override
    public void jump(int height) {

    }

    @Override
    public boolean isOnDistance() {
        return false;
    }

    @Override
    public void info() {

    }
}
