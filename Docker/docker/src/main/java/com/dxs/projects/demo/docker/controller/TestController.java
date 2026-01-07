package com.dxs.projects.demo.docker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@RestController
@RequestMapping("demo-api")
public class TestController {

    BufferedWriter br;

    {
        try {
            br = new BufferedWriter(new FileWriter("outputFile.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/getMessage")
    public ResponseEntity<String> getMessage(){
        String res = "Logged output : endpoint hit successfully.";
        try {
            br.write(res);
            br.newLine();
            br.flush();
            br.close();
            System.out.println("Wrote to the output log file");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok("Docker Demo File Reached");
    }

}
