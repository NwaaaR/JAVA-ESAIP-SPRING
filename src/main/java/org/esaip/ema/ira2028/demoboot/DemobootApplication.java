package org.esaip.ema.ira2028.demoboot;

// ------- Ajout des services de classes BavardService ------
import org.esaip.ema.ira2028.demoboot.service.BavardService;
import org.springframework.beans.factory.annotation.Autowired;
// ----------------------------------------------------------
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemobootApplication {

    @Autowired
    private BavardService bavardService;

    public static void main(String[] args) {
        SpringApplication.run(DemobootApplication.class, args);
    }

    @GetMapping("/blabla")
    public String hello() {
        bavardService.parler();
        return "La victoire appartient au plus opiniâtre; Rolland Garros";
    }

}
