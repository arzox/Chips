package tp5;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLogging {
    private static final Logger LOGGER = Logger.getLogger(TestLogging.class.getPackageName());

    public static void main(String[] args) {
        LOGGER.log(Level.CONFIG, "Mon premier log !" );
    }
}
