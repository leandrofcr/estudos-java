package entities.enums;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static SimpleDateFormat sdfWithHour = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private final Date moment;
    private OrderStatus status;
    private final Customer customer;

    List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Customer customer) {
        this.moment = moment;
        this.status = status;
        this.customer = customer;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem orderItem) {
        items.add(orderItem);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void removeItem(OrderItem orderItem) {
        items.remove(orderItem);
    }

    public double total() {
        double total = 0;

        for (OrderItem item : items) {
            total += item.subTotal();
        }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Order moment: ").append(sdfWithHour.format(moment)).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append(getCustomer()).append("\n");
        sb.append("Order items:").append("\n");

        for (OrderItem item : items) {
            sb.append(item).append("\n");
        }
        sb.append("Total price: $").append(formatCurrency(total()));

        return sb.toString();
    }

    public String formatCurrency(double value) {
        return String.format("%.2f", value);
    }

}
