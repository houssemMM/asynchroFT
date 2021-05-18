package com.javastar.asynchroFT.controller;

import com.javastar.asynchroFT.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/asynchroFT")
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @GetMapping("/sendMail")
    public String send(@RequestParam String mail) {
        notificationService.sendMessage(mail);
        return "Mail sent successfully to " + mail;
    }
}
