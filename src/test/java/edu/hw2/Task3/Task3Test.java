package edu.hw2.Task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {
    @Test
    void get_Stable_Connection() {
        PopularCommandExecutor commandExecutore = new PopularCommandExecutor(new DefaultConnectionManager(), 10);
        boolean executed;
        try {
            commandExecutore.updatePackages();
            executed = true;
        } catch (ConnectionException exception) {
            executed = false;
        }
        assertTrue(executed);
    }
    @Test
    void GetConnection() {
        PopularCommandExecutor executor =
            new PopularCommandExecutor(new FaultyConnectionManager(), 2);
        boolean executed;
        try {
            executor.updatePackages();
            executed = true;
        } catch (ConnectionException exception) {
            executed = false;
        }
        assertTrue(executed);
    }
}
