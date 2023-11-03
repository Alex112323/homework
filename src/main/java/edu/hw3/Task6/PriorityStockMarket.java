package edu.hw3.Task6;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityStockMarket implements StockMarket {
    private PriorityQueue<Stock> priorityQueue;

    public PriorityStockMarket() {
        Comparator<Stock> comparator = (object1, object2) -> object2.getPrice().compareTo(object1.getPrice());
        this.priorityQueue = new PriorityQueue<>(comparator);
    }

    @Override
    public void add(Stock stock) {
        priorityQueue.add(stock);
    }

    @Override
    public void remove(Stock stock) {
        priorityQueue.remove(stock);
    }

    @Override
    public Stock mostValuableStock() {
        return priorityQueue.peek();
    }
}
