package com.example.demo;

import org.springframework.web.bind.annotation.*;


@RestController 
@RequestMapping("/api/v1")
public class ChatbotController {
    private final ChatbotService chatbotService;
    public ChatbotController(ChatbotService chatbotService){
        this.chatbotService=chatbotService;
    }
    
    @GetMapping("/ask")
    public String ask(@RequestParam String question) {
        return chatbotService.answerUserQuery(question);
    }
    
}
