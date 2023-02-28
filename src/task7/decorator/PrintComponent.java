package task7.decorator;

public class PrintComponent implements Component{
    @Override
    public void operation() {
        System.out.println("    println('Hello world')");
    }
}

