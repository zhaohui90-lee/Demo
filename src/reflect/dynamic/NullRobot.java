package reflect.dynamic;

import reflect.demo2.Null;
import reflect.demo3.ClimbRobot;
import reflect.demo3.Robot;
import reflect.demo3.SnowRemoveRobot;

import java.lang.reflect.Proxy;

public class NullRobot {
    public static Robot newNullRobot(Class<? extends Robot> type){
        return (Robot) Proxy.newProxyInstance(
                NullRobot.class.getClassLoader(),
                new Class[]{Null.class,Robot.class},
                new NullRobotProxyHandler(type)
        );
    }

    public static void main(String[] args) {
        Robot[] bots = {
                new SnowRemoveRobot("SnowBee"),
                new ClimbRobot("Climb"),
                newNullRobot(SnowRemoveRobot.class),
                newNullRobot(ClimbRobot.class)
        };
        for (Robot bot : bots) {
            Robot.Test.test(bot);
        }
    }
}
