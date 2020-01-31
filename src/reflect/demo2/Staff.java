package reflect.demo2;

import java.util.ArrayList;

public class Staff extends ArrayList<Position> {
    public void add(String title,Person person){
        add(new Position(title,person));
    }

    public void add(String... titles){
        for (String title : titles) {
            add(new Position(title));
        }
    }
    public Staff(String... titles){
        add(titles);
    }
    public boolean positionAvailable(String title){
        for (Position position : this) {
            if (position.getTitle().equals(title) && position.getPerson() == Person.NULL){
                return true;
            }
        }
        return false;
    }
    public void fillPosition(String title,Person hire){
        for (Position position : this) {
            if (position.getTitle().equals(title) && position.getPerson() == Person.NULL){
                position.setPerson(hire);
                return;
            }
        }
        throw new RuntimeException("Position " + title + " not available");
    }

    public static void main(String[] args) {
        Staff staff = new Staff("President","CTO","Engineer");
        staff.fillPosition("President",new Person("Me","Last","123456"));
        if (staff.positionAvailable("Engineer")){
            staff.fillPosition("Engineer",new Person("Bon","Coder","21121212"));
        }
        System.out.println(staff);
    }
}
