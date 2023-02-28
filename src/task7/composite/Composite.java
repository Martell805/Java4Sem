package task7.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private List<Component> children;

    public void add(Component c){
        children.add(c);
    }

    public void remove(Component c){
        children.remove(c);
    }

    public List<Component> getChildren() {
        return new ArrayList<>(children);
    }

    @Override
    public void operation() {
        children.forEach(Component::operation);
    }
}
