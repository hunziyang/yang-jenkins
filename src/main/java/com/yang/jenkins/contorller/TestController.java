package com.yang.jenkins.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class TestController {

    @GetMapping
    public String test() {
        return "jenkins";
    }
}
