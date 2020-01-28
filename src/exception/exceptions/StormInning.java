package exception.exceptions;

public class StormInning extends Inning implements Storm {

    public StormInning() throws RainedOut,BaseballException{}

    @Override
    public void atBat() throws PopFoul {

    }

    public StormInning(String s) throws Foul,BaseballException{}

    @Override
    public void rainHard() throws RainedOut {

    }

//    public void walk() throws PopFoul{}

    public void event(){}


    public static void main(String[] args) {
        try {
            StormInning si = new StormInning();
        } catch (RainedOut rainedOut) {
            rainedOut.printStackTrace();
        } catch (BaseballException e) {
            e.printStackTrace();
        }


        try {
            Inning i = new StormInning();
        } catch (RainedOut rainedOut) {
            rainedOut.printStackTrace();
        } catch (BaseballException e) {
            e.printStackTrace();
        }

    }
}
