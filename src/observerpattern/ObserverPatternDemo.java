package observerpattern;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new ObserverThree(subject);

        new ObserverTwo(subject);
        new ObserverOne(subject);

        System.out.println("state one Specified: Delaware");
        subject.setState("Delaware");
        System.out.println("state two specified: North Carolina");
        subject.setState("North Carolina");
    }
}
