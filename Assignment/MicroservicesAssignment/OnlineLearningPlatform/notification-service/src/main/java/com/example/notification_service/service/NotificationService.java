package com.example.notification_service.service;

import com.example.notification_service.entity.Notification;
import com.example.notification_service.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public Notification sendNotification(Notification notification) {
        // Here you could add real email/SMS sending logic!
        notification.setSent(true);  // Simulate a successful send
        return notificationRepository.save(notification);
    }

    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    public Notification getNotificationById(Long id) {
        return notificationRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Notification not found with id: " + id));
    }

    public List<Notification> getByRequestId(Long requestId) {
        return notificationRepository.findByRequestId(requestId);
    }

    public void deleteNotification(Long id) {
        notificationRepository.deleteById(id);
    }
}
