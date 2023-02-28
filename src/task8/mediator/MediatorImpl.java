package task8.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator{
    private final List<Colleague> colleagues = new ArrayList<>();


    @Override
    public void subscribe(Colleague colleague) {
        this.colleagues.add(colleague);
    }

    @Override
    public void notifyAllColleagues() {
        this.colleagues.forEach(Colleague::note);
    }
}
