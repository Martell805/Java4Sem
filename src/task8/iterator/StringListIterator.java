package task8.iterator;

import java.util.List;

public class StringListIterator implements Iterator{
    private Integer i = -1;
    private List<String> list;

    public StringListIterator(List<String> list) {
        this.list = list;
    }

    @Override
    public String next() {
        i++;
        return list.get(i);
    }
}
