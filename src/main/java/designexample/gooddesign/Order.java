package designexample.gooddesign;

import designexample.OrderStatus;
import designexample.baddesign.Product;
import designexample.gooddesign.exceptions.OrderCancellationNotAllowedException;

import java.util.Collections;
import java.util.List;

public class Order {

    private OrderId orderId;
    private List<Product> products;
    private OrderStatus status;

    /*
    Method that expresses the intention of change, for example:
    I want to cancel an order, but I can’t cancel an order that was already shipped.
    I won't just pass the status in a set method,
    I will create a method that expresses this
    */
    public void cancel() {
        if (status == OrderStatus.SHIPPED) {
            throw new OrderCancellationNotAllowedException();
        }
        this.status = OrderStatus.CANCELED;
    }

    /*
    By doing this, we achieve three major benefits:
        -  Domain protection: Business rules are enforced inside the entity.
        -  Improved readability: The method name clearly communicates intent.
        -  Prevention of inconsistent states: Only valid transitions are allowed.

    * Additionally, this approach naturally promotes the use of Ubiquitous Language, a core DDD concept,
        ensuring that the code reflects the language of the business.
    */
    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }
}
