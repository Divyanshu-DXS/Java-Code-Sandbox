package com.dxs.projects.demo.docker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo-api")
public class TestController {

    @GetMapping("/getMessage")
    public ResponseEntity<String> getMessage(){
        return ResponseEntity.ok("Docker Demo File Reached");
    }
}
