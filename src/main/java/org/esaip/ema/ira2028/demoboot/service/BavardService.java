package org.esaip.ema.ira2028.demoboot.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class BavardService {
    private String name = "Marchand";
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println("Initialisation");
    }
    public void parler(){
        System.out.println("Je suis " + name + "\n" + this.getClass().getSimpleName());
    }
}
