package BehavioralPattern.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class MyMediator extends Mediator {
    private List<Colleague> colleagues = new ArrayList<Colleague>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague c : colleagues) {
            if (!c.equals(colleague)) {
                c.receive();
            }
        }
    }

}
