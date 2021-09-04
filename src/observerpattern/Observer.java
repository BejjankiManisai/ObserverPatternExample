package observerpattern;

import java.util.Observable;

public abstract class Observer {
    protected Subject subject;

    public abstract void update(Observable o, Object arg);
}