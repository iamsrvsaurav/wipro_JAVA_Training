package com.model;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-airplane.xml");

        TicketService ticketService = context.getBean("ticketService", TicketService.class);

        System.out.println(ticketService.confirmBooking("FL123", "USER456")); // Booking confirmed
        System.out.println(ticketService.confirmBooking("FL123", "USER789")); // Booking confirmed
        System.out.println(ticketService.confirmBooking("FL123", "USER999")); // Flight FL123 is full
        System.out.println(ticketService.confirmBooking("FL456", "USER000")); // Flight FL456 is full
    }
}
