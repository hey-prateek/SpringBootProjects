package com.example.__profilesDemo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class classHavingLoggers {

    //logger object
    private static final Logger logger = LoggerFactory.getLogger(classHavingLoggers.class);

    void printLogs(){

        //logging using logger object
        logger.info("logger info using logger object.....................................");
        logger.warn("logger warn using logger object.....................................");
        logger.error("logger error using logger object...................................");

        //logging using Slf4j annotation
        log.info("logger info using Slf4j annotation.....................................");
        log.warn("logger warn using Slf4j annotation.....................................");
        log.error("logger error using Slf4j annotation...................................");
    }
}
