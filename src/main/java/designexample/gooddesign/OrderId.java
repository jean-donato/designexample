package designexample.gooddesign;

import java.util.UUID;

public class OrderId {

    private UUID id;

    public OrderId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
