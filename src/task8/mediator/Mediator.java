package task8.mediator;

public interface Mediator {
    void subscribe(Colleague colleague);
    void notifyAllColleagues();
}
