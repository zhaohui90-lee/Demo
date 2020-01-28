package queue;

import java.util.Queue;

public class CommandsFire {
    public static void main(String[] args) {
        Commands commands = new Commands();
        Queue<Command> queue = commands.insertCommand();

        Queue<Command> queueDel = commands.insertCommand();;
        for (Command command : queue) {
            command.operation();

            System.out.println("deleteObj: " + queueDel.poll());
        }



        System.out.println(queueDel);
    }
}
