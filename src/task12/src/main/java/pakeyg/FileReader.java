package pakeyg;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Component
public class FileReader {
    @Value("#{springApplicationArguments.nonOptionArgs[0]}")
    private String inputFilePath;

    @Value("#{springApplicationArguments.nonOptionArgs[1]}")
    private String hashFilePath;

    @PostConstruct
    private void saveHash() throws NoSuchAlgorithmException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

        String text = FileUtils.readFileToString(new File(inputFilePath));
        messageDigest.update(text.getBytes());
        String stringHash = new String(messageDigest.digest());

        FileUtils.writeStringToFile(new File(hashFilePath), stringHash);
    }

    @PreDestroy
    private void deleteInputFile() throws IOException {
        Files.delete(Path.of(inputFilePath));
    }
}
