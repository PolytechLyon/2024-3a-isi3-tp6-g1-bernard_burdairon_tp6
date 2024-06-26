package fr.polytech.sim.log;

public class LoggerFactory {
    public static Logger createLogger(String name) {
        return new TimestampedLoggerDecorator(new ConsoleLogger(name));
    }
}
