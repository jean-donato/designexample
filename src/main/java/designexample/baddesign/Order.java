package designexample.baddesign;

import designexample.OrderStatus;

import java.util.List;

// The class only stores data but doesn't enforce business rules.
public class Order {

    private Long id;
    private List<Product> products;
    private OrderStatus status;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    // exposes the internal list reference, allowing external modification.
    public List<Product> getProducts() {
        return products;
    }

    public OrderStatus getStatus() {
        return status;
    }

    // setters make it easy for application services to modify state incorrectly.
    public void setId(Long id) {
        this.id = id;
    }

    // If business logic is in services instead of the entity, the system becomes harder to maintain.
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Allows invalid states without control.
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
