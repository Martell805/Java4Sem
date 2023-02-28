package task7.decorator;

public class BEDecorator implements Decorator{
    private final Component component;

    public BEDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        System.out.println("begin");
        component.operation();
        System.out.println("end");
    }
}
