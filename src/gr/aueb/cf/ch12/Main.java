package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.*;

public class Main {

    public static void main(String[] args) {
        Teacher teacher= new Teacher(1, "Athanasios", "Andr.");
        User user = new User(1, "Costas", "Mask", "cmask", "123456", true);
        Customer customer = new Customer(1, "Andrew", "Dimitriou", "123456789", "69696969696", "West Attica", "Attica", "Athens", "Patision", "76", "10434");
        Point point = new Point(0, 10);
        Order order = new Order(1, 5.3, "Meat", "Ordered");

        System.out.println("Teacher full name: " + teacher.getFirstname() + ", " + teacher.getLastname());
        System.out.println("User username: " + user.getUsername());
        System.out.println("Customer Vat: " + customer.getVatRegistrationNo());
        System.out.println("Order Formatted Timestamp" + order.getFormattedTimestamp());
        System.out.printf("Point: {%d, %d}\n", point.getX(), point.getY());
    }
}
