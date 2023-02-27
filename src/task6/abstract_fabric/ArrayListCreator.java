package task6.abstract_fabric;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator<T> implements ListCreator<T> {
    @Override
    public List<T> factoryMethod() {
        return new ArrayList<>();
    }
}
