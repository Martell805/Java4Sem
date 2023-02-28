package task6.abstract_fabric;

import java.util.List;

public class Client {
    private final List<Integer> list;

    public Client(ListCreator<Integer> factory) {
        list = factory.factoryMethod();
    }

    public List<Integer> getList() {
        return list;
    }
}
