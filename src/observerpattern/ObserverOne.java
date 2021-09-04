package observerpattern;


import java.util.Observable;

public class ObserverOne extends Observer implements java.util.Observer {

    public ObserverOne(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observer 1 state specified: " + "Texas");

    }

}
