import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;


import java.time.Instant;
import java.time.LocalDate;
import java.util.Scanner;

import static entities.DateFormatter.parseDate;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");

        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Email: ");
        String email = sc.next();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDateString = sc.next();

        LocalDate birthDate = parseDate(birthDateString);
        Client client = new Client(name, email, birthDate);

        System.out.print("Enter order data: \n");
        System.out.print("Status: ");
        String valueStatus = sc.next();
        OrderStatus orderStatus = OrderStatus.valueOf(valueStatus);

        System.out.print("How many items to this order: ");
        int howManyQuantity = sc.nextInt();
        sc.nextLine();
        Order order = new Order(Instant.now(), orderStatus, client);
        for (int i = 0; i < howManyQuantity; i++) {
            System.out.print("Enter #"+(i+1)+" item data: \n");
            System.out.print("Product name: ");
            String nameProduct = sc.next();

            System.out.print("Product price: ");
            Double price = sc.nextDouble();

            System.out.print("Quantity: ");
            Integer quantidade = sc.nextInt();
            sc.nextLine();
            Product product = new Product(nameProduct, price);
            OrderItem orderItem = new OrderItem(quantidade, price, product);
            order.addItem(orderItem);
        }
        System.out.println("ORDER SUMMARY: ");
        System.out.print(order.toString());
    }
}