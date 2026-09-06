package com.example.springbootscheduling.Scheduler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FixedRateScheduler {

    private static final Logger logger = LoggerFactory.getLogger("FixedRateScheduler.class");
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSSS");
    private int counter = 0;

    // @Scheduled(rate=5000) //use below if want to use timing from app.props file
    // @Scheduled(fixedRate = 5000, initialDelay = 10000) //if want with an initial
    // delay
    // @Scheduled(fixedRateString = "${rate}")
    // private void runEveryFiveSeconds() {
    // String time = LocalDateTime.now().format(formatter);
    // logger.info("logging process #{} at time {}", ++counter, time);
    // }

    // @Scheduled(fixedDelay = 5000)
    // private void runAfterDelayOfFiveSeconds() {
    // String time = LocalDateTime.now().format(formatter);
    // logger.info("logging process #{} at time {}", ++counter, time);
    // }

    @Scheduled(fixedDelay = 5000, initialDelay = 5000)
    // @Scheduled(cron = "0 0 9 * * *", zone = "Asia/Kolkata") //everyday at 9 am
    private void runAfterDelayOfFiveSecondsWithInitialDelay() {
        String time = LocalDateTime.now().format(formatter);
        logger.info("logging process #{} at time {}", ++counter, time);
    }
}
