package observerpattern;

import java.util.Observable;

public class ObserverTwo extends Observer implements java.util.Observer {

    public ObserverTwo(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observer 2 state specified: " + "Florida");

    }
}
