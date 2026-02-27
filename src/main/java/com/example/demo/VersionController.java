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
        return "Hi, this is the new commit of Dev branch";
    }
}

//http://devi-springboot-dev.eba-hzissitm.ap-south-1.elasticbeanstalk.com