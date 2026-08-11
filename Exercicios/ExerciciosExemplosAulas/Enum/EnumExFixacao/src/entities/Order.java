package entities;

import entities.enums.OrderStatus;

import java.time.Instant;

import java.util.ArrayList;
import java.util.List;

import static entities.DateFormatter.*;

public class Order {
    private Instant moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> orderItems = new ArrayList<>();

    public Order() {
    }

    public Order(Instant moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public void addItem(OrderItem item){
        orderItems.add(item);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(status+"\n");
        stringBuilder.append(formatInstantDate(moment)+"\n");
        stringBuilder.append(client.toString()+"\n");
        stringBuilder.append("Order items: "+"\n");
        for (OrderItem item : orderItems) {
            stringBuilder.append(item.toString()+"\n");
        }
        return stringBuilder.toString();
    }
}
