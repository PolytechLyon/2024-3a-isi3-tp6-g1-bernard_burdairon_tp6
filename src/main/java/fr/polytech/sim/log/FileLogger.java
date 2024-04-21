package fr.polytech.sim.log;

import java.io.FileWriter;
import java.io.IOException;

/**
 * File logger.
 */
class FileLogger extends NamedLogger {
    private static final String FILE_NAME = "logs.txt";

    /**
     * Constructor.
     *
     * @param name  logger name.
     */
    public FileLogger(String name) {
        super(name);
    }

    @Override
    synchronized public void log(String format, Object... args) {
        try (FileWriter fileWriter = new FileWriter(FILE_NAME, true)) {
            fileWriter.write(formatMessage(format, args));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
