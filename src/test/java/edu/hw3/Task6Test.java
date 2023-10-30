package edu.hw3;

import edu.hw3.Task6.PriorityStockMarket;
import edu.hw3.Task6.Stock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task6Test {
    @Test
    void stock_Test() {
        Stock stock1 = new Stock("1", 1);
        Stock stock2 = new Stock("1", 1);
        assertEquals(stock1, stock2);
    }
    @Test
    void priority_Stock_Market(){
        PriorityStockMarket stockMarket = new PriorityStockMarket();
        stockMarket.add(new Stock("stock1", 1));
        Stock stock8 = new Stock("stock6", 6);
        Stock stock9 = new Stock("stock6", 6);
        stockMarket.add(stock8);
        assertEquals(stock9, stockMarket.mostValuableStock());
    }
}
