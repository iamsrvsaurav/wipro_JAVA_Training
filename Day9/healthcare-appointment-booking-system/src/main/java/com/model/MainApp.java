package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        AppointmentService appointmentService = (AppointmentService) context.getBean("appointmentService");

        System.out.println(appointmentService.book("DOC101", "2025-04-10")); // "Appointment confirmed"
        System.out.println(appointmentService.book("DOC101", "2025-04-12")); // "Doctor not available"
        System.out.println(appointmentService.book("DOC102", "2025-04-10")); // "Appointment confirmed"
        System.out.println(appointmentService.book("DOC102", "2025-04-10")); // Now booked, so next time it should say "Doctor not available"
    }
}
