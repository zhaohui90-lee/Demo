package reflect.demo3;

import java.util.Collections;
import java.util.List;

public class ClimbRobot implements Robot {
    private String name;

    public ClimbRobot(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String model() {
        return "Climb Robot Series 11";
    }

    @Override
    public List<Operation> operation() {
        return Collections.emptyList();
    }
}
