package edu.hw2.Task3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FaultyConnection implements Connection {
    private final static Logger LOGGER = LogManager.getLogger();

    public void execute(String command) {
        double randomNumber = Math.random() * 2 - 1;
        if (randomNumber > 0) {
            throw new ConnectionException();
        } else {
            LOGGER.info("Executing of command - " + command);
        }
    }

    @Override
    public void close() {
        LOGGER.info("Connection closed");
    }
}
