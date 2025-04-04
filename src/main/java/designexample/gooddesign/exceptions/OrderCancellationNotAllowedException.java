package designexample.gooddesign.exceptions;

public class OrderCancellationNotAllowedException extends RuntimeException {
    public OrderCancellationNotAllowedException() {
        super("Cannot cancel an order that has already been shipped.");
    }
}
