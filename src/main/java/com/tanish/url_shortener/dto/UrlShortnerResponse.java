package com.tanish.url_shortener.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UrlShortnerResponse {

    UUID id;

    private String originalUrl;

    private String shortCode;

    private long clickCount;

    private LocalDateTime createdAt;

}
