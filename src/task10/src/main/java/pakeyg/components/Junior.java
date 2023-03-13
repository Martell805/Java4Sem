package pakeyg.components;

import org.springframework.stereotype.Component;
import pakeyg.interfaces.Programmer;

@Component
public class Junior implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("A lot of code");
    }
}
