package com.tanish.url_shortener.mapper;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tanish.url_shortener.dto.UrlShortnerResponse;
import com.tanish.url_shortener.model.UrlMapping;

@Component
public class UrlMapper {

    public static UrlShortnerResponse toResponse(UrlMapping urlMapping) {

        if (urlMapping == null) {
            throw new IllegalArgumentException();
        }

        return UrlShortnerResponse.builder()
                .id(urlMapping.getId())
                .originalUrl(urlMapping.getOriginalUrl())
                .shortCode(urlMapping.getShortCode())
                .clickCount(urlMapping.getClickCount())
                .createdAt(urlMapping.getCreatedAt())
                .build();
    }

    public static List<UrlShortnerResponse> toResponseList(List<UrlMapping> urlMappings) {
        if (urlMappings.isEmpty() || urlMappings == null) {
            return Collections.emptyList();
        }

        return urlMappings.stream()
                .map(UrlMapper::toResponse)
                .toList();

    }
}
