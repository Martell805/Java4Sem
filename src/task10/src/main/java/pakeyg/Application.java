package pakeyg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pakeyg.interfaces.Programmer;
import java.util.Locale;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        Programmer programmer = context.getBean(args[0].toLowerCase(Locale.ROOT), Programmer.class);
        programmer.doCoding();
    }
}
