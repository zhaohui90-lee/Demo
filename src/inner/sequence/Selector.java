package inner.sequence;

public interface Selector {
    boolean end();
    Object current();
    void next();
}
