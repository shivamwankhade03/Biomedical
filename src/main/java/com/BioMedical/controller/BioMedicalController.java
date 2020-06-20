package com.BioMedical.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/biomedical")
public class BioMedicalController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    @GetMapping("/welcome")
    public String websitesRunning() {
        LOGGER.debug("This is a debug message");
        LOGGER.info("This is an info message");
        LOGGER.warn("This is a warn message");
        LOGGER.error("This is an error message");
        return new String("hello");
   }
}
