package com.example.appointment_service.producer;

//package com.example.appointmentservice.producer;

import com.example.appointment_service.entity.Appointment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class NotificationProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Value("${notification.topic}")
    private String notificationTopic;

    public NotificationProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendAppointmentConfirmed(Appointment appointment) {
        try {
            String value = objectMapper.writeValueAsString(appointment);
            kafkaTemplate.send(notificationTopic, value);
        } catch (Exception ex) {
            // log error
            ex.printStackTrace();
        }
    }
}
