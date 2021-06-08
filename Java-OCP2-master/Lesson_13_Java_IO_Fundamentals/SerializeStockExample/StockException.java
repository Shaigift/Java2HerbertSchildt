package Lesson_13_Java_IO_Fundamentals.SerializeStockExample;

public class StockException extends Exception {
    private static final long serialVersionUID = 103L;
    public StockException (String reason) {
        super (reason);
    }
}
