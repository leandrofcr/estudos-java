package app;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date().toInstant(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        // CONVERTER STRING -> ENUM
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
        System.out.println();
        System.out.println("-----------------------");


    }
}
