package com.tanish.url_shortener.model;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "url_mappings")
public class UrlMapping {

    @Id
    @UuidGenerator
    UUID id;

    @Column(nullable = false)
    private String originalUrl;

    @Column(nullable = false, unique = true)
    private String shortCode;

    private long clickCount = 0;

    private LocalDateTime createdAt = LocalDateTime.now();

}
