package com.tanish.url_shortener.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.tanish.url_shortener.model.UrlMapping;
import com.tanish.url_shortener.repository.UrlRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UrlService {

    private final UrlRepository urlRepository;

    public UrlMapping save(UrlMapping urlMapping) {
        return urlRepository.save(urlMapping);
    }

    public UrlMapping createShortUrl(String originalUrl) {

        if (originalUrl == null || originalUrl == "") {
            throw new IllegalArgumentException();
        }

        String shortCode = UUID.randomUUID().toString().substring(0, 6);
        UrlMapping mapping = new UrlMapping();
        mapping.setOriginalUrl(originalUrl);
        mapping.setShortCode(shortCode);
        return save(mapping);
    }

    public UrlMapping getByShortCode(String shortCode) {
        UrlMapping mapping = urlRepository.findByShortCode(shortCode)
                .orElseThrow(() -> new RuntimeException("Short URL not found"));
        mapping.setClickCount(mapping.getClickCount() + 1);
        return save(mapping);
    }

    public List<UrlMapping> getAllUrls() {
        return urlRepository.findAll();
    }

}
