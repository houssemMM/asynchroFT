package com.javastar.asynchroFT.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class NotificationService {

    @Async
    public void sendMessage(String mail) {
        sleep(3);
        log.info("called 3rd party to send text message : " + Thread.currentThread().getName());
        log.info(String.valueOf(10/0));
    }

    private void sleep(int args) {
        try {
            TimeUnit.SECONDS.sleep(args);
        } catch (InterruptedException e) {
            log.error(e.getMessage());
        }
    }
}
