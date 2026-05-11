package com.tanish.url_shortener.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanish.url_shortener.dto.UrlShortnerResponse;
import com.tanish.url_shortener.mapper.UrlMapper;
import com.tanish.url_shortener.model.UrlMapping;
import com.tanish.url_shortener.services.UrlService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UrlController {

    private final UrlService urlService;

    @PostMapping("/shorten/{requestUrl}")
    public UrlShortnerResponse shortenUrl(@PathVariable String requestUrl) {

        UrlMapping urlMapping = urlService.createShortUrl(requestUrl);

        return UrlMapper.toResponse(urlMapping);
    }

    @GetMapping("/{shortCode}")
    public UrlShortnerResponse redirect(@PathVariable String shortCode) {
        UrlMapping mapping = urlService.getByShortCode(shortCode);
        return UrlMapper.toResponse(mapping);
    }

    @GetMapping("/stats")
    public List<UrlShortnerResponse> getStats() {
        List<UrlMapping> urlList = urlService.getAllUrls();

        return UrlMapper.toResponseList(urlList);
    }
}