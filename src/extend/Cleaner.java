package extend;

public class Cleaner {
    private String s = "cleaner";
    public void append(String a){ s+=a; }
    public void dilute(){
        append("dilute()");
    }
    public void apply(){
        append("apply()");
    }
    public void scrub(){
        append("scrub()");
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cleaner x = new Cleaner();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}
