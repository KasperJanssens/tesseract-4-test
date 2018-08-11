import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class OcrTest {

    @Test
    public void ocrThis() throws URISyntaxException {
        URL resource = OcrTest.class.getResource("test.png");

        String content = new Ocr().ocrThis(Paths.get(resource.toURI()));

        Assertions.assertThat(content).isEqualTo("Test 123");
    }
}