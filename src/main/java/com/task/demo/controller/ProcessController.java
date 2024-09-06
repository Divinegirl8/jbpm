package com.task.demo.controller;

import com.task.demo.dtos.ProcessRequest;
import com.task.demo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/process")
public class ProcessController {
    @Autowired
    private GreetingService greetingService;

    @PostMapping("/start")
    public ResponseEntity<String> startProcess(@RequestBody ProcessRequest processRequest) {
        greetingService.startProcess(processRequest.getProcessId());
        return ResponseEntity.ok("Process started");
    }
}
