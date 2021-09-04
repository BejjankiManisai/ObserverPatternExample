package observerpattern;

import java.util.Observable;

public class ObserverThree extends Observer implements java.util.Observer {

    public ObserverThree(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observer 3 state specified: " + "California");

    }
}
