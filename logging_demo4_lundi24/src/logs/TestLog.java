package logs;

import java.util.logging.Logger;

public class TestLog {
    
    private Logger logger = Logger.getLogger("Test");
    public void log() {
    logger.info("Debut de la methode log");
    }
}
