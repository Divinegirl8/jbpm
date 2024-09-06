package com.task.demo.service;

import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    @Autowired
    private KieContainer kieContainer;

    public void startProcess(String processId) {

        KieSession kieSession = kieContainer.newKieSession("helloworld");


        kieSession.startProcess(processId);


    }


}
