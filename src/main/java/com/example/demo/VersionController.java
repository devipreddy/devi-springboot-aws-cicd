package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @Value("${app.version}")
    private String version;

    @GetMapping("/version")
    public String getVersion() {
        return "Application Version: " + version;
    }
    @GetMapping("/")
    public String getHello(){
        return "Hello -> Development Branch Here";
    }
}

//http://devi-springboot-dev.eba-hzissitm.ap-south-1.elasticbeanstalk.com