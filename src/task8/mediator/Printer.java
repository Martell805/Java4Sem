package task8.mediator;

public class Printer implements Colleague{
    @Override
    public void note() {
        System.out.println("Hello!");
    }
}
