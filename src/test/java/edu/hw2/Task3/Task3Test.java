package edu.hw2.Task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {
    @Test
    void get_Stable_Connection() {
        PopularCommandExecutor commandExecutore = new PopularCommandExecutor(new DefaultConnectionManager(), 10);
        assertDoesNotThrow(() -> commandExecutore.updatePackages());
    }
    @Test
    void get_Connection() {
        PopularCommandExecutor executor =
            new PopularCommandExecutor(new FaultyConnectionManager(), 20);
        assertDoesNotThrow(() -> executor.updatePackages());
    }
}
