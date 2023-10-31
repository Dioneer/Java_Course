package main.robot;

public class Main {
    public static void main(String[] args) {
        Body body = new Body();
        Robot<BigHead> robot1 = new Robot<BigHead>(body,new BigHead());
        robot1.getHead().cry();
        robot1.getHead().voice();
        Robot<SmallHead> robot2 = new Robot<SmallHead>(body,new SmallHead());
        robot2.getHead().burn();
        robot2.getHead().voice();
        Robot<Mediumhead> robot3 = new Robot<Mediumhead>(body,new Mediumhead());
        robot3.getHead().turn();
        robot3.getHead().voice();
    }
}
