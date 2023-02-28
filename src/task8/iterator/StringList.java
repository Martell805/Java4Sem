package task8.iterator;

import java.util.List;

public class StringList implements Aggregate{
    private List<String> list;

    @Override
    public Iterator createIterator() {
        return new StringListIterator(list);
    }
}
