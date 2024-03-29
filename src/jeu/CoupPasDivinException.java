package jeu;

import tp5.TestLogging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CoupPasDivinException extends Exception {
    private static final Logger LOGGER = Logger.getLogger(TestLogging.class.getPackageName());
    public CoupPasDivinException() {
        LOGGER.log(Level.WARNING, "Vous êtes nul et mort" );
    }
}
