package edu.hw2.Task3;

public class DefaultConnectionManager implements ConnectionManager {
    @Override
    @SuppressWarnings("MagicNumber")
    public Connection getConnection() {
        double randomNumber = Math.random() * 7 - 6;
        if (randomNumber > 0) {
            return new FaultyConnection();
        }
        return new StableConnection();
    }
}
