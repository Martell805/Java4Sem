package pakeyg.components;

import org.springframework.stereotype.Component;
import pakeyg.interfaces.Programmer;

@Component
public class Senior implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("import solution;");
    }
}
