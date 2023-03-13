package pakeyg.components;

import org.springframework.stereotype.Component;
import pakeyg.interfaces.Programmer;

@Component
public class Middle implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("Little bit of code");
    }
}
