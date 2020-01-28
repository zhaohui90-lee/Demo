package extend.music;

public class Villain {
    private String name;
    protected void set(String nm){
        name = nm;
    }
    public Villain(String name){
        this.name = name;
    }
    public String toString(){
        return "I'm is a Villain and my name is " + name;
    }
}
