package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/website")
public class WebsiteBuilderController {
    private final WebsiteBuilderService websiteService;

    public WebsiteBuilderController(WebsiteBuilderService websiteService) {
        this.websiteService = websiteService;
    }

    @PostMapping
    public String generateWebsite(@RequestBody String message) {
        return websiteService.generate(message);
    }
}
