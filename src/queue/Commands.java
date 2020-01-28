package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Commands {

    public Queue<Command> insertCommand(){
        Queue<Command> queue = new LinkedList<Command>();
        for (int i = 0; i < 10; i++) {
            Command cc = new Command();
            cc.name = "name" + i;
            queue.offer(cc);
        }
        return queue;
    }
}
