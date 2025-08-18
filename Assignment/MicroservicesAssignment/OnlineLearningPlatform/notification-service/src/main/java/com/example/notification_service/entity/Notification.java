package com.example.notification_service.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String recipient;        // Email or phone number

    @Column(nullable = false)
    private String type;             // "EMAIL" or "SMS"

    @Column(nullable = false)
    private String content;          // Message content

    @Column(nullable = false)
    private Long requestId;          // FK to Request (from Citizen Service)

    private LocalDateTime createdAt;

    private Boolean sent = false;    // Delivery status

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    // ====== GETTERS & SETTERS ======
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRecipient() { return recipient; }
    public void setRecipient(String recipient) { this.recipient = recipient; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public Long getRequestId() { return requestId; }
    public void setRequestId(Long requestId) { this.requestId = requestId; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public Boolean getSent() { return sent; }
    public void setSent(Boolean sent) { this.sent = sent; }
}
