package org.esaip.ema.ira2028.demoboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemobootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemobootApplication.class, args);
    }

    @SpringBootApplication
    @RestController
    public class SpringDemoApplication {
        public static void main(String[] args) {
            SpringApplication.run(SpringDemoApplication.class, args);
        }
        @GetMapping("hello-toutlemonde")  // Change le nom dans le URl et le nom de la page.
        public String hello() {
            return "Bonjour, monde";
        }
    }

}
